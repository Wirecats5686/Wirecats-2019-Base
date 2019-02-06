package frc.robot.commands;

import frc.robot.Robot;
import edu.wpi.first.wpilibj.command.Command;


/**
 * Control the arm
 */
public class RunArm extends Command {

    public RunArm() {
        requires(Robot.arm);
    }

    // Called just before this Command runs the first time
    protected void initialize() {}

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
        // negate the axis value since down is positive, and we want down to be negative
        // TODO: ask hannah which gamepad button works best and change number value to match
    	Robot.arm.set(-Robot.oi.getGamepad().getRawAxis(5));
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    	Robot.arm.stop();
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    	end();
    }
}