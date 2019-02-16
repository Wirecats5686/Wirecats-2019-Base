package frc.robot.commands;

import frc.robot.Robot;
import edu.wpi.first.wpilibj.command.Command;

public class Camera extends Command {
    private boolean isFrontCamera;
    private boolean isCompleted;
    
     public Camera(){
         isFrontCamera = true;
     }

     protected void execute(){
        if(isFrontCamera) {
            Robot.server.setSource(Robot.backCamera);
            isFrontCamera = false;
        }
        else {
            Robot.server.setSource(Robot.frontCamera);
            isFrontCamera = true;
        }
        isCompleted = true;
     }

     protected boolean isFinished(){
        return isCompleted;
     }

     protected void end(){
         isCompleted = false;
     }
}