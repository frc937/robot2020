package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.BallIntake;

public class IntakeDown extends CommandBase {

    private BallIntake intake;

    public IntakeDown(BallIntake intakeSubsystem) {

        intake = intakeSubsystem;

        addRequirements(intakeSubsystem);

    }

    @Override
    public void initialize() {
        intake.down();

    }

    @Override
    public void end(boolean interrupted) {
        intake.stopVertical();

    }

    @Override
    public boolean isFinished() {
        return false;
        
    }

}