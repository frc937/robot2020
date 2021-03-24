package frc.robot.subsystems.pid_motors;
import edu.wpi.first.wpilibj2.command.PIDSubsystem;
import edu.wpi.first.wpilibj.controller.PIDController;
import edu.wpi.first.wpilibj.Encoder;
import frc.robot.Constants;
import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

public class PIDDriveLeft extends PIDSubsystem { 

    private CANSparkMax driveControllerLeft;
    private Encoder driveEncoderLeft;

    private static PIDController pidController;

    public PIDDriveLeft() {
        super(pidController);

        pidController = new PIDController(0, 0, 0);

        driveControllerLeft = new CANSparkMax(Constants.ID_SPARKMAX_DRIVE_LEFT, MotorType.kBrushed);
        driveEncoderLeft = new Encoder(Constants.PORT_ENCODER_DRIVE_LEFT_1, Constants.PORT_ENCODER_DRIVE_LEFT_2);

        driveEncoderLeft.setDistancePerPulse(1.97119);

    }

    public double getMeasurements() {


    }

    public void useOutput(double output, double setpoint) {

    }

}