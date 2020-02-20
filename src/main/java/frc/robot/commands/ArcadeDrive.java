package frc.robot.commands;

import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.Drive;

public class ArcadeDrive extends CommandBase {

    private final Drive drivetrain;

    public ArcadeDrive(Drive driveSubsystem) {
        drivetrain = driveSubsystem;
        addRequirements(driveSubsystem);

    }

    @Override
    public void initialize() {
        SmartDashboard.putString("Drive Mode", "Arcade");

    }

    @Override
    public void execute() {
        

    }

    @Override
    public void end(boolean interrupted) {

    }

    @Override
    public boolean isFinished() {
        return false;
    }

}