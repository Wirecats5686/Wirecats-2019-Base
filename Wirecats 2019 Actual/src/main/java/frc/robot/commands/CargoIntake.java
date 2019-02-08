package frc.robot.commands;

import frc.robot.Robot;
import edu.wpi.first.wpilibj.command.Command;

public class CargoIntake extends Command {
    public CargoIntake() {
        requires(Robot.cargo);
        setInterruptible(true);
    }

    protected void execute() {
        Robot.cargo.intakeCargo();
    }
	protected boolean isFinished() {
		return isTimedOut();
	}
    protected void end() {
    	Robot.cargo.stopIntake();
    }
    // subsystems is scheduled to run
    protected void interrupted() {
    	end();
    }
}