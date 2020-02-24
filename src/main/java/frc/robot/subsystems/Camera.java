package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import edu.wpi.first.cameraserver.CameraServer;

public class Camera extends SubsystemBase{

    private int device;

    public Camera(int port) {
        device = port;

    }

    public void startCamera() {
        CameraServer.getInstance().startAutomaticCapture(device);

    }

}