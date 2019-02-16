package frc.robot.commands;

import frc.robot.Robot;
import edu.wpi.first.wpilibj.command.Command;

public class Climb extends Command {
    private boolean isUp;
    private boolean isComplete;

    public Climb() {
        requires(Robot.climber);
    }

    /**
     * 
     */
    protected void execute() {
        if (isUp){
            Robot.climber.putFrontDown();;
            isUp = false;
        }
        else {
            Robot.climber.liftFrontUp();
            isUp = true;
        }

        isComplete = true;
    }

    /**
     * 
     */
    protected boolean isFinished() {
        return isComplete;
    }

    protected void end() {
        Robot.climber.stop();
        isComplete = false;
    }
}