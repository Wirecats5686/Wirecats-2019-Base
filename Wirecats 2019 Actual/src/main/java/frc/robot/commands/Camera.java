package frc.robot.commands;

import frc.robot.Robot;
import edu.wpi.first.wpilibj.command.Command;

public class Camera extends Command {
    private boolean isFrontCamera;
    
     public Camera(){
         isFrontCamera = true;
     }

     protected void execute(){
        if(isFrontCamera) {
            Robot.server.setSource(Robot.camera1);
            isFrontCamera = false;
        }
        else {
            Robot.server.setSource(Robot.camera2);
            isFrontCamera = true;
        }
     }

     protected boolean isFinished(){
        return isTimedOut();
     }
}