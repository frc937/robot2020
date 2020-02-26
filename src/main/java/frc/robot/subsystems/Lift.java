package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;
import frc.robot.Constants;

public class Lift extends SubsystemBase {

    private CANSparkMax liftController;
    private double liftSpeed;

    public Lift() {

        liftController = new CANSparkMax(Constants.ID_SPARKMAX_LIFT, MotorType.kBrushed);

        liftController.setInverted(false);

    }

    public void turn() {

        liftSpeed = 1.0;
        liftController.set(liftSpeed);

    }

    public void stop() {

        liftSpeed = 0.0;

    }

}