package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.Drive;

public class AutoDrive extends CommandBase {

    private Drive drivetrain;
    private double linearSpeed;
    private double rotationalSpeed;

    public AutoDrive(Drive drivesubsystem) {
        drivetrain = drivesubsystem;
        addRequirements(drivesubsystem);

    }

    @Override
    public void initialize() {
        
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