package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import edu.wpi.first.cameraserver.CameraServer;
import edu.wpi.cscore.UsbCamera;
import edu.wpi.cscore.VideoSource.ConnectionStrategy;

public class Camera extends SubsystemBase{

    private int device;
    private UsbCamera camera;

    public Camera(int port) {
        device = port;

    }

    public void startCamera() {
        camera = CameraServer.getInstance().startAutomaticCapture(device);

        camera.setConnectionStrategy(ConnectionStrategy.kKeepOpen);

    }

}