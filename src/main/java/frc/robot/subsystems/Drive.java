package frc.robot.subsystems;

import edu.wpi.first.wpilibj.GenericHID.Hand;
//import edu.wpi.first.wpilibj2.command.PIDSubsystem;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj.controller.ProfiledPIDController;
import edu.wpi.first.wpilibj.trajectory.TrapezoidProfile;
import edu.wpi.first.wpilibj.trajectory.TrapezoidProfile.Constraints;
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
    public static DifferentialDrive drivetrain;
    private double pValue;
    private double iValue;
    private double dValue;
    private double maxVelocity;
    private double maxAcceleration;

    /*
    public double leftXValue = controller.getX(Hand.kLeft);
    public double leftYValue = controller.getY(Hand.kLeft);
    public double rightXValue = controller.getX(Hand.kRight);
    public double rightYValue = controller.getY(Hand.kRight);
    */

    public Drive(){

        pidController = new ProfiledPIDController(pValue, iValue, dValue, new TrapezoidProfile.Constraints(maxVelocity, maxAcceleration));

        driveControllerLeft = new CANSparkMax(Constants.ID_SPARKMAX_DRIVE_LEFT, MotorType.kBrushed);
        driveControllerRight = new CANSparkMax(Constants.ID_SPARKMAX_DRIVE_RIGHT, MotorType.kBrushed);

        driveEncoderLeft = new Encoder(Constants.PORT_ENCODER_DRIVE_LEFT_1, Constants.PORT_ENCODER_DRIVE_LEFT_2);

        drivetrain = new DifferentialDrive(driveControllerLeft, driveControllerRight);

        driveEncoderLeft.setDistancePerPulse(1.97119);

        driveControllerLeft.setInverted(false);
        driveControllerRight.setInverted(true);

    }

    public void moveArcade(double x, double z){
        drivetrain.arcadeDrive(x, z, true);

    } 

    public void moveTank(double lSpeed, double rSpeed){
        drivetrain.tankDrive(lSpeed, rSpeed, true);

    }

    public void stop(){
        driveControllerLeft.stopMotor();
        driveControllerRight.stopMotor();
        
    }

}