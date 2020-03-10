package frc.robot.commands.groups;

import edu.wpi.first.wpilibj2.command.ParallelCommandGroup;
import edu.wpi.first.wpilibj2.command.WaitCommand;
import frc.robot.subsystems.Drive;
import frc.robot.commands.AutoDrive;

public class AutoGroup extends ParallelCommandGroup {

    public AutoGroup(Drive drivetrain) {
        addCommands(
            new AutoDrive(drivetrain),
            new WaitCommand(0.25)
        );

    }

}