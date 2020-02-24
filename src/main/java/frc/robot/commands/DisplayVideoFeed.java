package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.RunCommand;
import frc.robot.subsystems.Camera;

public class DisplayVideoFeed extends RunCommand {

    public DisplayVideoFeed(Runnable toRun, Camera... requirements) {
        super(toRun, requirements);

    }

}