package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;
import frc.robot.Constants;

public class Drive extends SubsystemBase {

    public static CANSparkMax driveControllerLeft;
    public static CANSparkMax driveControllerRight;

    public static DifferentialDrive drivetrain;

    public Drive(){
        driveControllerLeft = new CANSparkMax(Constants.ID_SPARKMAX_DRIVE_LEFT, MotorType.kBrushed);
        driveControllerRight = new CANSparkMax(Constants.ID_SPARKMAX_DRIVE_RIGHT, MotorType.kBrushed);

        driveControllerLeft.setInverted(false);
        driveControllerRight.setInverted(true);

        drivetrain = new DifferentialDrive(driveControllerLeft, driveControllerRight);

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