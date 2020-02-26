package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.Lift;

public class Climb extends CommandBase {

    private Lift liftArm;

    public Climb(Lift liftSubsystem) {

        liftArm = liftSubsystem;

        addRequirements(liftSubsystem);

    }

    @Override
    public void initialize() {
        liftArm.turn();

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