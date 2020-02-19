package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import com.revrobotics.CANSparkMax;

public class Drive extends SubsystemBase {

    public static CANSparkMax driveControllerLeft;
    public static CANSparkMax driveControllerRight;

    public static DifferentialDrive drivetrain;

}