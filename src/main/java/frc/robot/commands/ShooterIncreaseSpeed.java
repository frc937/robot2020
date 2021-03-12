package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.commands.GetShooterSpeed;

public class ShooterIncreaseSpeed extends CommandBase {

    public double speed;
    public GetShooterSpeed getShooterSpeed;

    public ShooterIncreaseSpeed() {
        getShooterSpeed = new GetShooterSpeed(true);

    }

    @Override
    public void initialize() {
        speed = getShooterSpeed.speed;
        speed = speed + 0.05;
    }
  
    @Override
    public void execute() {
    }
 
    @Override
    public void end(boolean interrupted) {
        getShooterSpeed.schedule();

    }
  
    @Override
    public boolean isFinished() {
      return false;
    }
    
}