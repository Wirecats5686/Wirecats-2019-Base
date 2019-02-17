package frc.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Robot;


/**
 * Command for controlling arm on robot
 */
public class RunArm extends Command {
    // Flag that indicates if we're moving the arm up
    private boolean goingUp;

    /**
     * Create new instance of RunArm, involves setting of:
     * (1) timeout
     * (1) goingUp flag
     * (2) subsystem requirement
     * 
     * @param goingUp true if moving arm up,
     *   otherwise arm is moving down
     */
    public RunArm(boolean goingUp) {
        // setting timeout to prevent continuous movement
        super(0.25);
        this.goingUp = goingUp;
        requires(Robot.arm);
    }

    /**
     * Move arm up or down (depending on goingUp flag)
     *   when command is called
     */
    protected void execute() {
        /*Check to see if the arm should go up or down; 
        arm speed will be set to -1 for up & 1 for down */
        if (goingUp){
            Robot.arm.set(-1);
        }
        else {
            Robot.arm.set(1);
        }
    }

    /**
     * Command is finished once elapsed time has met/exceeded timeout;
     *   once switches are added, will also mark as finished if corresponding switch is active
     */
    protected boolean isFinished() {
        // Code below is commented out until switches are added for arm
        // When arm is being raised, return whether we've hit the "upSwitch"
        // if (goingUp){
        //     return isTimedOut || Robot.arm.isArmUp();
        // }

        // Otherwise, return whether we've hit the "downSwitch"
       // return isTimedOut || Robot.arm.isArmDown();

        return isTimedOut();
    }

    /**
     * Stop moving arm when command is finished or interrupted
     */
    protected void end() {
    	Robot.arm.stop();
    }

    /**
     * Call end method when command is interrupted
     */
    protected void interrupted() {
    	end();
    }
}