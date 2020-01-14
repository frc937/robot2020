package frc.robot;

import frc.robot.Constants;
import edu.wpi.first.wpilibj.AnalogInput;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

public class Ultrasonic extends AnalogInput{

    public Ultrasonic(int port) {
        super(port);

    }

    public void updateDashboard(String key){
        int value = this.getValue();
        double display = value * Constants.MM_TO_INCH;

        SmartDashboard.putNumber(key, display);

    }

}