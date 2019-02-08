package frc.robot.commands;

import frc.robot.Robot;
import edu.wpi.first.wpilibj.command.Command;

public class CargoShoot extends Command {

    private boolean isHighShoot;

    public CargoShoot(boolean isHighShoot) {
        this.isHighShoot = isHighShoot;
        requires(Robot.cargo);
        setInterruptible(true);      
    }

    protected void execute() {
        if (isHighShoot) {
            Robot.cargo.shootIntoCargoShip();
        }
        else {
            Robot.cargo.shootIntoRocket();
        }       
    }
	protected boolean isFinished() {
		return isTimedOut();
	}
    protected void end() {
    	Robot.cargo.stopShoot();
    }
    // subsystems is scheduled to run
    protected void interrupted() {
    	end();
    }
}