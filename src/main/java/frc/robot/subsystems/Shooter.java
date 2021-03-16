package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import com.ctre.phoenix.motorcontrol.can.VictorSPX;
import com.ctre.phoenix.motorcontrol.ControlMode;
import frc.robot.Constants;
import frc.robot.commands.GetShooterSpeed;

public class Shooter extends SubsystemBase {

    public VictorSPX shoot;
    //public GetShooterSpeed shootSpeed;

    public static double shootSpeed;


    public Shooter() {
        shootSpeed = 0.5;
        shoot = new VictorSPX(Constants.ID_VICTORSPX_SHOOTER);

    }

    public void go() {
        shoot.set(ControlMode.PercentOutput, shootSpeed);

    }

    public void stop() {
        shoot.set(ControlMode.PercentOutput, 0.0);

    }

}