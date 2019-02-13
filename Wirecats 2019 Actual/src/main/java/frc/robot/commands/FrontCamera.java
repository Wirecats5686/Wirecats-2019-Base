package frc.robot.commands;

import frc.robot.Robot;
import edu.wpi.first.wpilibj.command.Command;

public class FrontCamera extends Command {
     public FrontCamera(){

     }
     protected void execute(){
        Robot.server.setSource(Robot.camera2);
    }
     protected boolean isFinished(){
         return false;
     }
}   