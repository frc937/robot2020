package frc.robot.commands;

import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj.GenericHID.Hand;
import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.Drive;
import frc.robot.RobotContainer;

public class ArcadeDrive extends CommandBase {

    private final Drive drivetrain;
    private double arcadeX;
    private double arcadeZ;

    public ArcadeDrive(Drive driveSubsystem) {
        drivetrain = driveSubsystem;
        addRequirements(driveSubsystem);

    }

    @Override
    public void initialize() {
        SmartDashboard.putString("Drive Mode", "Arcade");
        /************************************************************************\
        | Remove line 27 after running once (if Distance Input is on SmartDash)  |
        \************************************************************************/
        SmartDashboard.putNumber("Distance Input", 42.55);

    }

    @Override
    public void execute() {
        arcadeZ = RobotContainer.controller.getY(Hand.kLeft);
        arcadeX = RobotContainer.controller.getX(Hand.kRight) * -1.0;
        drivetrain.moveArcade(arcadeX, arcadeZ);

    }

    @Override
    public void end(boolean interrupted) {
        drivetrain.stop();

    }

    @Override
    public boolean isFinished() {
        return false;
    }

}