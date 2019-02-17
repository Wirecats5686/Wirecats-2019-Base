package frc.robot.commands;

import frc.robot.Robot;
import edu.wpi.first.wpilibj.command.Command;

/**
 * 
 */
public class CargoSpit extends Command {

    /**
     * 
     */
    public CargoSpit() {
        requires(Robot.cargo);
        setInterruptible(true);      
    }

    /**
     * 
     */
    protected void execute() {
        Robot.cargo.spitCargo();      
    }

    /**
     * 
     */
	protected boolean isFinished() {
		return false;
    }
    
    /**
     * 
     */
    protected void end() {
    	Robot.cargo.stopShoot();
    }
    
    /**
     * 
     */
    protected void interrupted() {
    	end();
    }
}