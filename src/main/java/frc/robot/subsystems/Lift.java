package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import com.revrobotics.CANSparkMax;

public class Lift extends SubsystemBase {

    private CANSparkMax liftController;

    public Lift() {

        liftController = new CANSparkMax(deviceID, type);

    }

}