package frc.robot;

import edu.wpi.first.wpilibj.AnalogInput;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

public class Ultrasonic extends AnalogInput{

    public Ultrasonic(int port) {
        super(port);


    
    }

    public void updateDashboard(){
        int value = this.getValue();
        final double CONVERSION = 0.0492126;
        double display = value * CONVERSION;

        SmartDashboard.putNumber("Ultrasonic1", display);

    }

}