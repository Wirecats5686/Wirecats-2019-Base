package frc.robot.commands;

import frc.robot.Robot;
import edu.wpi.first.wpilibj.command.Command;

/**
 * 
 */
public class FrontClimbUp extends Command {

    /**
     * 
     */
    public FrontClimbUp() {
        super(Robot.SOLENOID_TIMEOUT);
        requires(Robot.frontClimber);
        setInterruptible(true);
    }

    /**
     * 
     */
    protected void execute() {
        Robot.frontClimber.liftFrontUp();
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
        Robot.frontClimber.stop();
    }

    /**
     * 
     */
    protected void interrupted() {
    	end();
    }
}