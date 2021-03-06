package frc.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Robot;

/**
 * Command for bringing back of robot down
 */
public class BackClimbDown extends Command {

    /**
     * Create new instance of BackClimbDown, setting timeout and subsystem requirement
     */
    public BackClimbDown() {
        super(Robot.SOLENOID_TIMEOUT);
        requires(Robot.backClimber);
        setInterruptible(true);
    }

    /**
     *  Put back of robot down when command is called
     */
    protected void execute() {
        Robot.backClimber.putBackDown();
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
        Robot.backClimber.stop();
    }

    /**
     * Call end method when command is interrupted
     */
    protected void interrupted() {
    	end();
    }
}