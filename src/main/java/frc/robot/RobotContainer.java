/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018-2019 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import edu.wpi.first.wpilibj.GenericHID;
import edu.wpi.first.wpilibj.XboxController;
import frc.robot.commands.ArcadeDrive;
import frc.robot.commands.DisplayUltrasonic;
import frc.robot.commands.ExampleCommand;
import frc.robot.subsystems.ExampleSubsystem;
import frc.robot.subsystems.Ultrasonic;
import frc.robot.subsystems.Drive;
import frc.robot.Constants;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.button.JoystickButton;
import edu.wpi.first.wpilibj2.command.button.POVButton;



/**
 * This class is where the bulk of the robot should be declared.  Since Command-based is a
 * "declarative" paradigm, very little robot logic should actually be handled in the {@link Robot}
 * periodic methods (other than the scheduler calls).  Instead, the structure of the robot
 * (including subsystems, commands, and button mappings) should be declared here.
 */
public class RobotContainer {
  // The robot's subsystems and commands are defined here...
  private final ExampleSubsystem m_exampleSubsystem = new ExampleSubsystem();
  private final Ultrasonic ultrasonic1 = new Ultrasonic(Constants.PORT_ULTRASONIC_1, "Ultrasonic 1");
  private final Ultrasonic ultrasonic2 = new Ultrasonic(Constants.PORT_ULTRASONIC_2, "Ultrasonic 2");
  private final Drive driveSubsystem = new Drive();

  private final ExampleCommand m_autoCommand = new ExampleCommand(m_exampleSubsystem);
  private final DisplayUltrasonic dispUltrasonic1 = new DisplayUltrasonic(() -> ultrasonic1.updateDashboard(), ultrasonic1);
  private final DisplayUltrasonic dispUltrasonic2 = new DisplayUltrasonic(() -> ultrasonic2.updateDashboard(), ultrasonic2);
  private final ArcadeDrive driveA = new ArcadeDrive(driveSubsystem);

  public static XboxController controller = new XboxController(Constants.CONTROLLER_NUMBER);

  /**
   * The container for the robot.  Contains subsystems, OI devices, and commands.
   */
  public RobotContainer() {
    // Configure the button bindings
    configureButtonBindings();
  }


  /**
   * Use this method to define your button->command mappings.  Buttons can be created by
   * instantiating a {@link GenericHID} or one of its subclasses ({@link
   * edu.wpi.first.wpilibj.Joystick} or {@link XboxController}), and then passing it to a
   * {@link edu.wpi.first.wpilibj2.command.button.JoystickButton}.
   */
  private void configureButtonBindings() {
    JoystickButton aButton = new JoystickButton(controller, Constants.A_NUMBER);
    JoystickButton bButton = new JoystickButton(controller, Constants.B_NUMBER);
    JoystickButton xButton = new JoystickButton(controller, Constants.X_NUMBER);
    JoystickButton yButton = new JoystickButton(controller, Constants.Y_NUMBER);
    JoystickButton leftBumper = new JoystickButton(controller, Constants.LEFT_BUMPER_NUMBER);
    JoystickButton rightBumper = new JoystickButton(controller, Constants.RIGHT_BUMPER_NUMBER);
    JoystickButton backButton = new JoystickButton(controller, Constants.BACK_NUMBER);
    JoystickButton startButton = new JoystickButton(controller, Constants.START_NUMBER);
    JoystickButton leftStick = new JoystickButton(controller, Constants.LEFT_STICK_NUMBER);
    JoystickButton rightStick = new JoystickButton(controller, Constants.RIGHT_STICK_NUMBER);
    JoystickButton leftTrigger = new JoystickButton(controller, Constants.LEFT_TRIGGER);
    JoystickButton rightTrigger = new JoystickButton(controller, Constants.RIGHT_TRIGGER);
    POVButton dpadUp = new POVButton(controller, 0);
    POVButton dpadRight = new POVButton(controller, 90);
    POVButton dpadDown = new POVButton(controller, 180);
    POVButton dpadLeft = new POVButton(controller, 270);
    
  }

  /**
   * Use this to pass the autonomous command to the main {@link Robot} class.
   *
   * @return the command to run in autonomous
   */
  public Command getAutonomousCommand() {
    // An ExampleCommand will run in autonomous
    return m_autoCommand;
  }

  public Command getDisplayU1Command() {
    return dispUltrasonic1;

  }

  public Command getDisplayU2Command() {
    return dispUltrasonic2;
  }

}
