package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.pid_motors.PIDDriveLeft;
import frc.robot.subsystems.pid_motors.PIDDriveRight;

public class PIDDrive extends CommandBase{

public PIDDriveRight pidDriveRight;
public PIDDriveLeft pidDriveLeft;

    public PIDDrive(PIDDriveLeft driveLeft, PIDDriveRight driveRight) {
        
        pidDriveRight = driveRight;
        pidDriveLeft = driveLeft;

        addRequirements(driveLeft);
        addRequirements(driveRight);
        
    }

    @Override
    public void initialize() {

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