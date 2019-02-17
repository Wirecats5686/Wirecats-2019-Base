package frc.robot.commands;

import frc.robot.Robot;
import edu.wpi.first.wpilibj.command.Command;

/**
 * Command for shooting cargo (either low or high shoot)
 */
public class CargoShoot extends Command {
    // Flag that indicates if we're doing a high shoot
    private boolean isHighShoot;

    /**
     * Create new instance of CargoShoot, involves setting of:
     * (1) highShoot flag
     * (2) subsystem requirement
     * (3) interruptible flag
     * 
     * @param isHighShoot true if executing a high shoot, 
     *     otherwise executing low shoot
     */
    public CargoShoot(boolean isHighShoot) {
        this.isHighShoot = isHighShoot;
        requires(Robot.cargo);
        setInterruptible(true);      
    }

    /**
     * Shoot the cargo high or low (depending on highShoot flag)
     */
    protected void execute() {
        if (isHighShoot) {
            Robot.cargo.shootIntoCargoShip();
        }
        else {
            Robot.cargo.shootIntoRocket();
        }       
    }

    /**
     * Command does not "finish"; will be ended via
     *   interruption or cancellation
     */
	protected boolean isFinished() {
		return false;
    }
    
    /**
     * Stop shooting when command has been interrupted or cancelled
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