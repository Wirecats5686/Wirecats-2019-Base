package frc.robot.commands;

import frc.robot.Robot;
import edu.wpi.first.wpilibj.command.Command;

public class CargoShoot extends Command {
    // TODO: Replace hatchSolenoid with implementation similar to drive
    public CargoShoot() {
        requires(Robot.drivetrain);
        setInterruptible(true);
    }

    protected void execute() {
        // Robot.hatchSolenoid.SolenoidRetract();
    }
	protected boolean isFinished() {
		return isTimedOut();
	}
    protected void end() {
    	// Robot.hatchSolenoid.stop();
    }
    // subsystems is scheduled to run
    protected void interrupted() {
    	end();
    }
}