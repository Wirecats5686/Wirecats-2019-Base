package frc.robot.commands;

import frc.robot.Robot;
import edu.wpi.first.wpilibj.command.Command;

public class CargoShoot extends Command {

    public boolean isLowCargoShoot;
    // TODO: Replace hatchSolenoid with implementation similar to drive
    public CargoShoot(boolean lowcargo) {
        requires(Robot.cargo);
        setInterruptible(true);
        this.isLowCargoShoot = lowcargo;

    }

    protected void execute() {
        // Robot.hatchSolenoid.SolenoidRetract();
        
        if(isLowCargoShoot) {
            //executes low cargo shooting
        }
        else{
            //executes high cargo shooting
        }
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