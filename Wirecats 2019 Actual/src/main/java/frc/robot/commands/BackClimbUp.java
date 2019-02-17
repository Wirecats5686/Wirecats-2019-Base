package frc.robot.commands;

import frc.robot.Robot;
import edu.wpi.first.wpilibj.command.Command;

/**
 * 
 */
public class BackClimbUp extends Command {

    /**
     * 
     */
    public BackClimbUp() {
        super(Robot.SOLENOID_TIMEOUT);
        requires(Robot.backClimber);
        setInterruptible(true);
    }

    /**
     * 
     */
    protected void execute() {
        Robot.backClimber.liftBackUp();
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
        Robot.backClimber.stop();
    }

    /**
     * 
     */
    protected void interrupted() {
    	end();
    }
}