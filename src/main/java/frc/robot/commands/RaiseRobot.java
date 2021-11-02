package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.Lift;

public class RaiseRobot extends CommandBase {

    private Lift liftArm;

    public RaiseRobot(Lift subsystemLift) {

        liftArm = subsystemLift;

        addRequirements(subsystemLift);

    }

    @Override
    public void initialize() {
        liftArm.turnFast();

    }

    @Override
    public void end(boolean interrupted) {
        liftArm.stop();

    }

    @Override
    public boolean isFinished() {
        return false;
        
    }

}