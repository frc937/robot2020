package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.Shooter;

public class Shoot extends CommandBase {

    private Shooter shooter;

    public Shoot(Shooter shooterSubsystem) {

        shooter = shooterSubsystem;

        addRequirements(shooterSubsystem);

    }

    @Override
    public void initialize() {
        shooter.go();

    }

    @Override
    public void end(boolean interrupted) {
        shooter.stop();

    }

    @Override
    public boolean isFinished() {
        return false;
        
    }

}