package frc.robot.commands;

import frc.robot.Robot;
import edu.wpi.first.wpilibj.command.Command;

/**
 * 
 */
public class HatchGrab extends Command {

    /**
     * 
     * @param timeout
     */
    public HatchGrab() {
        super(Robot.SOLENOID_TIMEOUT);
        requires(Robot.hatch);
        setInterruptible(true);
    }

    /**
     * 
     */
    protected void execute() {
        Robot.hatch.grabHatch();
    }

    /**
     * 
     */
	protected boolean isFinished() {
		return isTimedOut();
    }

    /**
     * 
     */
    protected void end() {
    	Robot.hatch.stop();
    }

    /**
     * 
     */
    protected void interrupted() {
    	end();
    }
}