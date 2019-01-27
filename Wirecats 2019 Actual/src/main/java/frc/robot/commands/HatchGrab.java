package frc.robot.commands;

import frc.robot.Robot;
import edu.wpi.first.wpilibj.command.Command;

public class HatchGrab extends Command {

    public HatchGrab(double timeout) {
        super(timeout);
        requires(Robot.hatchSolenoid);
        setInterruptible(true);
    }

    protected void execute() {
        Robot.hatchSolenoid.SolenoidExtend();
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