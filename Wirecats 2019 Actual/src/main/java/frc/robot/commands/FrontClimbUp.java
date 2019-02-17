package frc.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Robot;

/**
 * Command for lifting front of robot up
 */
public class FrontClimbUp extends Command {

    /**
     * Create new instance of FrontClimbUp, setting timeout and subsystem requirement
     */
    public FrontClimbUp() {
        super(Robot.SOLENOID_TIMEOUT);
        requires(Robot.frontClimber);
        setInterruptible(true);
    }

    /**
     *  Lift front of robot up when command is called
     */
    protected void execute() {
        Robot.frontClimber.liftFrontUp();
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