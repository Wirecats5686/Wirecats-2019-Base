package frc.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Robot;

/**
 * Command for driving the robot
 */
public class TankDrive extends Command {

    /**
     * Create new instance of DriveTrain, setting subsytem requirement
     */
    public TankDrive() {
        requires(Robot.drivetrain);
    }

    /**
     * Get Y values of left & right Joysticks to determine speed and 
     *   direction in which the robot should drive
     */
    protected void execute() {
    	Robot.drivetrain.drive(-Robot.oi.getLeft().getY(), -Robot.oi.getRight().getY());
    }

    /**
     * This command should be constantly running as long as robot is enabled;
     *   therefore, isFinished is set to always return false
     */
    protected boolean isFinished() {
        return false;
    }

    /**
     * Stop driving if command is cancelled
     */
    protected void end() {
        Robot.drivetrain.stop();
    }
}
