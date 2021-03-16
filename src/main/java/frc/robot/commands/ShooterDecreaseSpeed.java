package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.Shooter;

public class ShooterDecreaseSpeed extends CommandBase {

    public double speed;
    //public GetShooterSpeed getShooterSpeed;

    public ShooterDecreaseSpeed() {
        //getShooterSpeed = new GetShooterSpeed(false);

    }

    @Override
    public void initialize() {
        speed = Shooter.shootSpeed;
        speed = speed + 0.05;
        Shooter.shootSpeed = speed;
    }
  
    @Override
    public void execute() {
    }
 
    @Override
    public void end(boolean interrupted) {
        //getShooterSpeed.schedule();

    }
  
    @Override
    public boolean isFinished() {
      return false;
    }
    

}