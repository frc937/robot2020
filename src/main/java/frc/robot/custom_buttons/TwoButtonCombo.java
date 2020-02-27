package frc.robot.custom_buttons;

import edu.wpi.first.wpilibj2.command.button.Button;
import edu.wpi.first.wpilibj.GenericHID;

public class TwoButtonCombo extends Button {

    private GenericHID controller;
    private int button1Number;
    private int button2Number;

    public TwoButtonCombo(GenericHID joystick, int button1, int button2) {

        controller = joystick;
        button1Number = button1;
        button2Number = button2;

    }

}