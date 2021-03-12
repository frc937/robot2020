package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.commands.ShooterIncreaseSpeed;
import frc.robot.commands.ShooterDecreaseSpeed;

public class GetShooterSpeed extends CommandBase {

    public boolean speedIncreased;
    public double speed;
    public ShooterIncreaseSpeed increaseSpeed;
    public ShooterDecreaseSpeed decreaseSpeed;

    public GetShooterSpeed(boolean isIncrease) {
        speedIncreased = isIncrease;
        speed = 1.0;
    }

    @Override
    public void initialize() {
        if (speedIncreased = true) {
            speed = increaseSpeed.speed;
        }
        else {
            speed = decreaseSpeed.speed;
        }

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