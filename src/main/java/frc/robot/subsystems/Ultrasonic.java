package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import edu.wpi.first.wpilibj.AnalogInput;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

public class Ultrasonic extends SubsystemBase {

    private AnalogInput input;

    private String key;
    private int rawValue;
    private double value;

    private double ULTRASONIC_TO_INCH = 0.0492126;


    public Ultrasonic(int port, String label){
        input = new AnalogInput(port);
        key = label;
    }

    public void getDistance() {
        rawValue = input.getValue();
        value = rawValue * ULTRASONIC_TO_INCH;

    }

    public void updateDashboard() {
        getDistance();
        SmartDashboard.putNumber(key, value);

    }

}