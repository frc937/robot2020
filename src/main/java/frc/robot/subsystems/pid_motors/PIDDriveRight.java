package frc.robot.subsystems.pid_motors;
import edu.wpi.first.wpilibj2.command.PIDSubsystem;
import edu.wpi.first.wpilibj.controller.PIDController;
import edu.wpi.first.wpilibj.Encoder;
import frc.robot.Constants;
import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

public class PIDDriveRight extends PIDSubsystem { 

    private CANSparkMax driveControllerRight;
    private Encoder driveEncoderRight;

    public static PIDController pidController;

    public PIDDriveRight() {
        super(pidController);

        pidController = new PIDController(0, 0, 0);

        driveControllerRight = new CANSparkMax(Constants.ID_SPARKMAX_DRIVE_RIGHT, MotorType.kBrushed);
        driveEncoderRight = new Encoder(Constants.PORT_ENCODER_DRIVE_RIGHT_1, Constants.PORT_ENCODER_DRIVE_RIGHT_2);

        driveEncoderRight.setDistancePerPulse(1.97119);

    }

    public double getMeasurement() {
        return driveEncoderRight.getDistance();

    }

    public void useOutput(double output, double setpoint) {
        double measurement = getMeasurement();
        //output = pidController.calculate(measurement, setpoint);
        driveControllerRight.pidWrite(output);

    }

}