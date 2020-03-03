package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import com.ctre.phoenix.motorcontrol.can.VictorSPX;
import frc.robot.Constants;

public class BallIntake extends SubsystemBase {

    private VictorSPX intakeController;

    public BallIntake() {

        intakeController = new VictorSPX(Constants.ID_VICTORSPX_INTAKE);

    }

}