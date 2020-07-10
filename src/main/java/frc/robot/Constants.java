/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018-2019 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

/**
 * The Constants class provides a convenient place for teams to hold robot-wide numerical or boolean
 * constants.  This class should not be used for any other purpose.  All constants should be
 * declared globally (i.e. public static).  Do not put anything functional in this class.
 *
 * <p>It is advised to statically import this class (or one of its inner classes) wherever the
 * constants are needed, to reduce verbosity.
 */
public final class Constants {
    public static int PORT_ULTRASONIC_1 = 0;
    public static int PORT_ULTRASONIC_2 = 1;
    public static int PORT_CAMERA_1 = 0;
    public static int PORT_CAMERA_2 = 1;

    public static final int ID_SPARKMAX_DRIVE_LEFT = 1;
    public static final int ID_SPARKMAX_DRIVE_RIGHT = 2;
    public static final int ID_SPARKMAX_LIFT1 = 3;
    public static final int ID_SPARKMAX_LIFT2 = 4;

    public static final int CONTROLLER_NUMBER = 0;

    public static final int A_NUMBER = 1;
    public static final int B_NUMBER = 2;
    public static final int X_NUMBER = 3;
    public static final int Y_NUMBER = 4;
    public static final int LEFT_BUMPER_NUMBER = 5;
    public static final int RIGHT_BUMPER_NUMBER = 6;
    public static final int BACK_NUMBER = 7;
    public static final int START_NUMBER = 8;
    public static final int LEFT_STICK_NUMBER = 9;
    public static final int RIGHT_STICK_NUMBER = 10;

    public static final int POV_NUMBER = 0;

    public static final int LEFT_X_AXIS = 0;
    public static final int LEFT_Y_AXIS = 1;
    public static final int RIGHT_X_AXIS = 4;
    public static final int RIGHT_Y_AXIS = 5;

    //public static final int LEFT_TRIGGER = 2;
    //public static final int RIGHT_TRIGGER = 3;
    public static final double TRIGGER_PULL_THRESHOLD = 0.7;

}
