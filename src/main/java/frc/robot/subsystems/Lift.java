package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;
import frc.robot.Constants;

public class Lift extends SubsystemBase {

    private CANSparkMax liftController1;
    private CANSparkMax liftController2;
    private double liftSpeed;

    public Lift() {

        liftController1 = new CANSparkMax(Constants.ID_SPARKMAX_LIFT1, MotorType.kBrushed);
        liftController2 = new CANSparkMax(Constants.ID_SPARKMAX_LIFT2, MotorType.kBrushed);

        liftController1.setInverted(false);
        liftController2.setInverted(false);

    }

    public void turn() {

        liftSpeed = 0.3;
        liftController1.set(liftSpeed);
        liftController2.set(liftSpeed);

    }

    public void stop() {

        liftSpeed = 0.0;
        liftController1.set(liftSpeed);
        liftController2.set(liftSpeed);

    }

    public void reset() {

        liftSpeed = -0.3;
        liftController1.set(liftSpeed);
        liftController2.set(liftSpeed);

    }

}