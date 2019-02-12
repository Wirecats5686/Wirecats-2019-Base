package frc.robot.commands;

import frc.robot.Robot;
import edu.wpi.first.wpilibj.command.Command;

public class Climb extends Command {

    public Climb() {
        requires(Robot.climber);
    }

    protected boolean isFinished() {
        return false;
    }

    // TODO: Implement climb execution based on mechanical design
    // Use 3 cylinders, 2 solonoids (front and back) similar to hatch
    protected void execute() {

    }
}