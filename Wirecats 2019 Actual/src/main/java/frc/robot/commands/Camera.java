package frc.robot.commands;

import frc.robot.Robot;
import edu.wpi.first.wpilibj.command.Command;

/**
 * Command for switching which camera is shown on dashboard
 */
public class Camera extends Command {
    // Flag for whether front camera is one currently being shown
    private boolean isFrontCamera;

    // Flag for indicating whether command has been completed
    private boolean isCompleted;
    
    /**
     * Create a new instance of Camera, setting frontCamera flag to true
     */
     public Camera(){
         isFrontCamera = true;
     }

     /**
      * Switch to inactive camera when command is called;
      *   once camera has been switched mark command as completed
      */
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

     /**
      * Check if command has been completed;
      *  returns true once it has
      */
     protected boolean isFinished(){
        return isCompleted;
     }

     /**
      * Reset completed flag once commanad has finished
      */
     protected void end(){
         isCompleted = false;
     }
}