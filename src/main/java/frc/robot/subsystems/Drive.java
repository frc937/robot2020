package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
//import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;
import frc.robot.Constants;

import edu.wpi.first.wpiutil.math.MathUtil;


public class Drive extends SubsystemBase {

    public static CANSparkMax driveControllerLeft;
    public static CANSparkMax driveControllerRight;

    //public static DifferentialDrive drivetrain;

    public double m_rightSideInvertMultiplier = -1.0;

    public Drive(){
        driveControllerLeft = new CANSparkMax(Constants.ID_SPARKMAX_DRIVE_LEFT, MotorType.kBrushed);
        driveControllerRight = new CANSparkMax(Constants.ID_SPARKMAX_DRIVE_RIGHT, MotorType.kBrushed);

        driveControllerLeft.setInverted(false);
        driveControllerRight.setInverted(true);

        //drivetrain = new DifferentialDrive(driveControllerLeft, driveControllerRight);

    }

    public void arcadeDrive(double xSpeed, double zRotation, boolean squareInputs) {
    
        xSpeed = MathUtil.clamp(xSpeed, -1.0, 1.0);
    
        zRotation = MathUtil.clamp(zRotation, -1.0, 1.0);
    
        // Square the inputs (while preserving the sign) to increase fine control
        // while permitting full power.
        if (squareInputs) {
          xSpeed = Math.copySign(xSpeed * xSpeed, xSpeed);
          zRotation = Math.copySign(zRotation * zRotation, zRotation);
        }
    
        double leftMotorOutput;
        double rightMotorOutput;
    
        double maxInput = Math.copySign(Math.max(Math.abs(xSpeed), Math.abs(zRotation)), xSpeed);
    
        if (xSpeed >= 0.0) {
          // First quadrant, else second quadrant
          if (zRotation >= 0.0) {
            leftMotorOutput = maxInput;
            rightMotorOutput = xSpeed - zRotation;
          } else {
            leftMotorOutput = xSpeed + zRotation;
            rightMotorOutput = maxInput;
          }
        } else {
          // Third quadrant, else fourth quadrant
          if (zRotation >= 0.0) {
            leftMotorOutput = xSpeed + zRotation;
            rightMotorOutput = maxInput;
          } else {
            leftMotorOutput = maxInput;
            rightMotorOutput = xSpeed - zRotation;
          }
        }
    
        driveControllerLeft.set(MathUtil.clamp(leftMotorOutput, -1.0, 1.0) * 100);
        double maxOutput = 100 * m_rightSideInvertMultiplier;
        driveControllerRight.set(MathUtil.clamp(rightMotorOutput, -1.0, 1.0) * maxOutput);
    
      }

    public void moveArcade(double x, double z){
        arcadeDrive(x, z, true);


    }

    public void moveTank(double lSpeed, double rSpeed){
        //drivetrain.tankDrive(lSpeed, rSpeed, true);

    }

    public void stop(){
        driveControllerLeft.stopMotor();
        driveControllerRight.stopMotor();
        
    }

}