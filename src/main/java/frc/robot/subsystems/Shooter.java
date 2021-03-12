package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import com.ctre.phoenix.motorcontrol.can.VictorSPX;
import com.ctre.phoenix.motorcontrol.ControlMode;
import frc.robot.Constants;

public class Shooter extends SubsystemBase {

    public VictorSPX shoot;

    public Shooter() {
        shoot = new VictorSPX(Constants.ID_VICTORSPX_SHOOTER);

    }

}