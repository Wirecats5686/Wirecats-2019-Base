package frc.robot.commands;

import frc.robot.Robot;
import edu.wpi.first.wpilibj.command.Command;

public class HatchRelease extends Command {

    public HatchRelease(double timeout) {
        super(timeout);
        requires(Robot.hatchSolenoid);
        setInterruptible(true);
    }

    protected void execute() {
        Robot.hatchSolenoid.SolenoidRetract();
    }
	protected boolean isFinished() {
		return isTimedOut();
	}
    protected void end() {
    	Robot.hatchSolenoid.stop();
    }
    // subsystems is scheduled to run
    protected void interrupted() {
    	end();
    }
}