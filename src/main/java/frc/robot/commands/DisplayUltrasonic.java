package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.RunCommand;
import frc.robot.subsystems.Ultrasonic;

public class DisplayUltrasonic extends RunCommand {

    public DisplayUltrasonic(Runnable toRun, Ultrasonic... requirements) {
        super(toRun, requirements);

    }

}