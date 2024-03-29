package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.Lift;

public class RaiseLift extends CommandBase {

    private Lift liftArm;

    public RaiseLift(Lift subsystemLift) {

        liftArm = subsystemLift;

        addRequirements(subsystemLift);

    }

    @Override
    public void initialize() {
        liftArm.turnSlow();

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