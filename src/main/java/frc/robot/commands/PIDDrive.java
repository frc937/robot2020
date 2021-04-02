package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.pid_motors.PIDDriveLeft;
import frc.robot.subsystems.pid_motors.PIDDriveRight;
import frc.robot.subsystems.Drive;

public class PIDDrive extends CommandBase{

public PIDDriveRight pidDriveRight;
public PIDDriveLeft pidDriveLeft;
public Drive drivetrain;

    public PIDDrive(PIDDriveLeft driveLeft, PIDDriveRight driveRight, Drive driveSubsystem) {
        
        pidDriveRight = driveRight;
        pidDriveLeft = driveLeft;
        drivetrain = driveSubsystem;

        addRequirements(driveLeft);
        addRequirements(driveRight);
        addRequirements(driveSubsystem);
        
    }

    @Override
    public void initialize() {
        pidDriveLeft.useOutput(output, setpoint);
    }

    @Override
    public void execute() {

    }

    @Override
    public void end(boolean isFinished) {

    }

    @Override
    public boolean isFinished() {
        return false;
    }


}