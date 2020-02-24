package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.Camera;

public class DisplayVideoFeed extends CommandBase {

    public DisplayUltrasonic(Runnable toRun, Camera... requirements) {
        super(toRun, requirements);

    }

}