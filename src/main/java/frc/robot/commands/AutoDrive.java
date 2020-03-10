package frc.robot.commands;

import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.Drive;

public class AutoDrive extends CommandBase {

    private Drive drivetrain;
    private double linearSpeed;
    private double rotationalSpeed;

    public AutoDrive(Drive drivesubsystem) {
        drivetrain = drivesubsystem;
        addRequirements(drivesubsystem);

    }

    @Override
    public void initialize() {
        SmartDashboard.putString("Drive Mode", "Autonomous");

        linearSpeed = -0.5;
        rotationalSpeed = 0.0;
        drivetrain.moveArcade(linearSpeed, rotationalSpeed);
        
    }

    @Override
    public void end(boolean interrupted) {

    }

    @Override
    public boolean isFinished() {
        return false;

    }

}