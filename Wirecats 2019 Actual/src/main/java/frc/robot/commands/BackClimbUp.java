package frc.robot.commands;

import frc.robot.Robot;
import edu.wpi.first.wpilibj.command.Command;

/**
 * Command for lifting back of robot up
 */
public class BackClimbUp extends Command {

    /**
     * Create new instance of BackClimbUp, setting timeout and subsystem requirement
     */
    public BackClimbUp() {
        super(Robot.SOLENOID_TIMEOUT);
        requires(Robot.backClimber);
        setInterruptible(true);
    }

    /**
     *  Lift back of robot up by calling appropriate method from subsystem
     */
    protected void execute() {
        Robot.backClimber.liftBackUp();
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