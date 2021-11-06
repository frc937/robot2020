package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.BallIntake;

public class IntakeOut extends CommandBase {

    private BallIntake intake;

    public IntakeOut(BallIntake intakeSubsystem) {

        intake = intakeSubsystem;

        addRequirements(intakeSubsystem);

    }

    @Override
    public void initialize() {
        intake.out();

    }

    @Override
    public void end(boolean interrupted) {
        intake.stopSpin();

    }

    @Override
    public boolean isFinished() {
        return false;
        
    }

}