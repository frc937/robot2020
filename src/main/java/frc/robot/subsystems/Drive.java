package frc.robot.subsystems;

import edu.wpi.first.wpilibj.GenericHID.Hand;
//import edu.wpi.first.wpilibj2.command.PIDSubsystem;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj.controller.ProfiledPIDController;
import edu.wpi.first.wpilibj.controller.SimpleMotorFeedforward;
import edu.wpi.first.wpilibj.trajectory.TrapezoidProfile;
import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.Encoder;
import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;
import frc.robot.Constants;
import frc.robot.RobotContainer;
import frc.robot.commands.ArcadeDrive;


public class Drive extends SubsystemBase {

    public static CANSparkMax driveControllerLeft;
    public static CANSparkMax driveControllerRight;
    public static Encoder driveEncoderRight;
    public static Encoder driveEncoderLeft;
    public static ProfiledPIDController pidController;
    public static SimpleMotorFeedforward feedforward;
    public static DifferentialDrive drivetrain;

    private double pValue;
    private double iValue;
    private double dValue;
    private double sValue;
    private double vValue;
    private double aValue;
    private double maxVelocity;
    private double maxAcceleration;

    private double lastSpeed;
    private double lastTime;

    /*
    public double leftXValue = controller.getX(Hand.kLeft);
    public double leftYValue = controller.getY(Hand.kLeft);
    public double rightXValue = controller.getX(Hand.kRight);
    public double rightYValue = controller.getY(Hand.kRight);
    */

    public Drive(){

        pValue = 0;
        iValue = 0;
        dValue = 0;
        sValue = 0;
        vValue = 0;
        aValue = 0;
        maxVelocity = 5;
        maxAcceleration = 20;

        pidController = new ProfiledPIDController(pValue, iValue, dValue, new TrapezoidProfile.Constraints(maxVelocity, maxAcceleration));

        feedforward = new SimpleMotorFeedforward(sValue, vValue, aValue);

        driveControllerLeft = new CANSparkMax(Constants.ID_SPARKMAX_DRIVE_LEFT, MotorType.kBrushed);
        driveControllerRight = new CANSparkMax(Constants.ID_SPARKMAX_DRIVE_RIGHT, MotorType.kBrushed);

        driveEncoderLeft = new Encoder(Constants.PORT_ENCODER_DRIVE_LEFT_1, Constants.PORT_ENCODER_DRIVE_LEFT_2);
        driveEncoderRight = new Encoder(Constants.PORT_ENCODER_DRIVE_RIGHT_1, Constants.PORT_ENCODER_DRIVE_RIGHT_2);

        drivetrain = new DifferentialDrive(driveControllerLeft, driveControllerRight);

        driveEncoderLeft.setDistancePerPulse(1.97119);
        driveEncoderRight.setDistancePerPulse(1.97119);

        driveControllerLeft.setInverted(false);
        driveControllerRight.setInverted(true);

        driveEncoderLeft.setReverseDirection(false);
        driveEncoderRight.setReverseDirection(true);

    }

    /* Should add FeedForward and PID with gyro sensor once NavX oporational */
    public void moveArcade(double x, double z){

        //double ffpidX = feedforward.calculate(x) + pidController.calculate(driveEncoderLeft.getRate(), x);
        //double ffpidZ = feedforward.calculate(z) + pidController.calculate(driveEncoderRight.getRate(), z);

        drivetrain.arcadeDrive(x, z, true);

    } 

    public void moveTank(double lSpeed, double rSpeed){

        double ffpidLSpeed = feedforward.calculate(lSpeed) + pidController.calculate(driveEncoderLeft.getRate(), lSpeed);
        double ffpidRSpeed = feedforward.calculate(rSpeed) + pidController.calculate(driveEncoderRight.getRate(), rSpeed);

        drivetrain.tankDrive(ffpidLSpeed, ffpidRSpeed, true);

    }

    public void stop(){
        driveControllerLeft.stopMotor();
        driveControllerRight.stopMotor();
        
    }

    public void goToPosition(double goalPosition){
        double acceleration = (pidController.getSetpoint().velocity - lastSpeed) / (Timer.getFPGATimestamp() - lastTime);
        driveControllerLeft.setVoltage(pidController.calculate(driveEncoderLeft.getDistance(), 
            goalPosition) + feedforward.calculate(pidController.getSetpoint().velocity, 
            acceleration));
        lastSpeed = pidController.getSetpoint().velocity;
        lastTime = Timer.getFPGATimestamp();

    }

    
}