package frc.robot.commands;

import frc.robot.Robot;
import edu.wpi.first.wpilibj.command.Command;

public class FrontClimbDown extends Command {

    public FrontClimbDown() {
        super(0.25);
        requires(Robot.frontClimber);
        setInterruptible(true);
    }

    /**
     * 
     */
    protected void execute() {
        Robot.frontClimber.putFrontDown();
    }

    /**
     * 
     */
    protected boolean isFinished() {
        return isTimedOut();
    }

    protected void end() {
        Robot.frontClimber.stop();
    }

    // subsystems is scheduled to run
    protected void interrupted() {
    	end();
    }
}