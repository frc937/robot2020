package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.VictorSPX;
import com.ctre.phoenix.motorcontrol.ControlMode;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class BallIntake extends SubsystemBase {

    private VictorSPX vertical;
    private VictorSPX spin;

    public BallIntake() {

        vertical = new VictorSPX(Constants.ID_VICTORSPX_INTAKE_VERTICAL);
        spin = new VictorSPX(Constants.ID_VICTORSPX_INTAKE_SPIN);

    }

    public void up() {
        vertical.set(ControlMode.PercentOutput, -1.0);

    }

    public void down() {
        vertical.set(ControlMode.PercentOutput, 1.0);

    }

    public void in() {
        spin.set(ControlMode.PercentOutput, 1.0);

    }

    public void out() {
        spin.set(ControlMode.PercentOutput, -1.0);

    }

    public void stopVertical() {
        vertical.set(ControlMode.PercentOutput, 0.0);

    }

    public void stopSpin() {
        spin.set(ControlMode.PercentOutput, 0.0);

    }

}