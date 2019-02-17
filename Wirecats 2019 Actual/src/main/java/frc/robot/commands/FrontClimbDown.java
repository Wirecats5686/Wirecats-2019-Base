package frc.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Robot;

/**
 * Command for bringing front of robot down
 */
public class FrontClimbDown extends Command {

    /**
     * Create new instance of FrontClimbDown, setting timeout and subsystem requirement
     */
    public FrontClimbDown() {
        super(Robot.SOLENOID_TIMEOUT);
        requires(Robot.frontClimber);
        setInterruptible(true);
    }

    /**
     *  Put front of robot down when command is called
     */
    protected void execute() {
        Robot.frontClimber.putFrontDown();
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
        Robot.frontClimber.stop();
    }

    /**
     * Call end method when command is interrupted
     */
    protected void interrupted() {
    	end();
    }
}