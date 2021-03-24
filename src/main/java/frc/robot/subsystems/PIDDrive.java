package frc.robot.subsystems;
import edu.wpi.first.wpilibj2.command.PIDSubsystem;
import edu.wpi.first.wpilibj.controller.PIDController;
import edu.wpi.first.wpilibj.Encoder;
import frc.robot.Constants;
import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

public class PIDDrive extends PIDSubsystem { 

    private CANSparkMax driveControllerRight;
    private CANSparkMax driveControllerLeft;
    private Encoder driveEncoderRight;
    private Encoder driveEncoderLeft;

    private static PIDController pidController;

    public PIDDrive() {
        super(pidController);

        pidController = new PIDController(0, 0, 0);

        driveControllerLeft = new CANSparkMax(Constants.ID_SPARKMAX_DRIVE_LEFT, MotorType.kBrushed);
        driveControllerRight = new CANSparkMax(Constants.ID_SPARKMAX_DRIVE_RIGHT, MotorType.kBrushed);
        driveEncoderLeft = new Encoder(sourceA, sourceB);
        driveEncoderRight = new Encoder(sourceA, sourceB);

    }

    public double getMeasurements() {


    }

    public void useOutput(double output, double setpoint) {

    }

}