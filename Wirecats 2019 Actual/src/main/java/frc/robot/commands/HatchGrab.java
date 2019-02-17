package frc.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Robot;

/**
 * Command for grabbing a hatch panel
 */
public class HatchGrab extends Command {

    /**
     * Create new instance of HatchGrab, setting timeout and subsystem requirement
     */
    public HatchGrab() {
        super(Robot.SOLENOID_TIMEOUT);
        requires(Robot.hatch);
        setInterruptible(true);
    }

    /**
     * Grab hatch panel when command is called
     */
    protected void execute() {
        Robot.hatch.grabHatch();
    }

    /**
     * Command is finished once elapsed time has met/exceeded timeout
     */
	protected boolean isFinished() {
		return isTimedOut();
    }

    /**
     * Stop solenoid execution once command is finished/interrupted
     */
    protected void end() {
    	Robot.hatch.stop();
    }

    /**
     * Call end method when command is interrupted
     */
    protected void interrupted() {
    	end();
    }
}