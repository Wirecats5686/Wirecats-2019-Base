package frc.robot.commands;

import frc.robot.Robot;
import edu.wpi.first.wpilibj.command.Command;


/**
 * Control the arm
 */
public class RunArm extends Command {
    private boolean goingUp;

    public RunArm(boolean goingUp) {
        this.goingUp = goingUp;
        requires(Robot.arm);
    }

    // Called just before this Command runs the first time
    protected void initialize() {}

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
        /*Check to see if the arm should go up or down; 
        arm will be set to 1 if we are otherwise will be set to -1 (going down)*/
        if (goingUp){
            Robot.arm.set(1);
        }
        else {
            Robot.arm.set(-1);
        }
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        // When arm is being raised, return whether we've hit the "upSwitch"
        if (goingUp){
            return Robot.arm.getUpSwitch();
        }

        // Otherwise, return whether we've hit the "downSwitch"
        return Robot.arm.getDownSwitch();
    }

    // Called once after isFinished returns true
    protected void end() {
    	Robot.arm.stop();
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    	end();
    }
}