package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.Lift;

public class ResetWinch extends CommandBase {

    private Lift liftArm;

    public ResetWinch(Lift subsystemLift) {

        liftArm = subsystemLift;

        addRequirements(subsystemLift);

    }

    @Override
    public void initialize() {
        liftArm.reset();

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