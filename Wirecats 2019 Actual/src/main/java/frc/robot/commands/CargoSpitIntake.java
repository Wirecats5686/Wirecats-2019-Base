package frc.robot.commands;

import frc.robot.Robot;
import edu.wpi.first.wpilibj.command.Command;

/**
 * Command for spitting or intaking cargo from top of robot
 */
public class CargoSpitIntake extends Command {

    /**
     * Create a new instance of CargoSpitIntake, 
     *   setting subsystem requirment and interruptible flag
     */
    public CargoSpitIntake() {
        requires(Robot.cargo);
        setInterruptible(true);      
    }

    /**
     * Spit/intake cargo from top when command is called
     */
    protected void execute() {
        Robot.cargo.spitIntakeCargo();      
    }

    /**
     * Command does not "finish"; will be ended via
     *   interruption or cancellation
     */
	protected boolean isFinished() {
		return false;
    }
    
    /**
     * Stop spit/intake when command has been interrupted or cancelled
     */
    protected void end() {
    	Robot.cargo.stopShoot();
    }
    
    /**
     * Call end method when command is interrupted
     */
    protected void interrupted() {
    	end();
    }
}