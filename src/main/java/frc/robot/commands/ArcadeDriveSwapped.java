package frc.robot.commands;

import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj.GenericHID.Hand;
import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.Drive;
import frc.robot.RobotContainer;

public class ArcadeDriveSwapped extends CommandBase {

    private final Drive drivetrain;
    private double arcadeX;
    private double arcadeZ;

    public ArcadeDriveSwapped(Drive driveSubsystem) {
        drivetrain = driveSubsystem;
        addRequirements(driveSubsystem);

    }

    @Override
    public void initialize() {
        SmartDashboard.putString("Drive Mode", "Arcade (Swapped)");

    }

    @Override
    public void execute() {
        arcadeX = RobotContainer.controller.getY(Hand.kLeft);
        arcadeZ = RobotContainer.controller.getX(Hand.kRight) * -1.0;
        drivetrain.moveArcade(arcadeX, arcadeZ);

    }

    @Override
    public void end(boolean interrupted) {
        drivetrain.stop();

    }

    @Override
    public boolean isFinished() {
        return false;
    }

}