package frc.robot.commands;

import frc.robot.Robot;
import edu.wpi.first.wpilibj.command.Command;

public class BackCamera extends Command {
     public BackCamera(){

     }
     protected void execute(){
        Robot.server.setSource(Robot.camera1);
     }

     protected boolean isFinished(){
         return false;
     }
}