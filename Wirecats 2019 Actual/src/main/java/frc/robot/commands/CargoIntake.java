package frc.robot.commands;

import frc.robot.Robot;
import edu.wpi.first.wpilibj.command.Command;

/**
 * Command for intaking cargo
 */
public class CargoIntake extends Command {
    
    /**
     * Create new instance of CargoIntake, setting subsytem requirement
     *   and interruptible flag
     */
    public CargoIntake() {
        requires(Robot.cargo);
        setInterruptible(true);
    }

    /**
     * Intake cargo when command is called by calling appropriate subsystem method
     */
    protected void execute() {
        Robot.cargo.intakeCargo();
    }

    /**
     * Command does not "finish"; will be ended via
     *   interruption or cancellation
     */
	protected boolean isFinished() {
		return false;
    }
    
    /**
     * Stop intake when command has been interrupted or cancelled
     */
    protected void end() {
    	Robot.cargo.stopIntake();
    }

    /**
     * Call end method when command is interrupted
     */
    protected void interrupted() {
    	end();
    }
}