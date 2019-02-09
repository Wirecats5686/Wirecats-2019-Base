package frc.robot.subsystems;

import frc.robot.commands.Climb;
import edu.wpi.first.wpilibj.command.Subsystem;

public class Climber extends Subsystem {
    
    public Climber() {
        super("Climber");
    }

    public void initDefaultCommand() {
        setDefaultCommand(new Climb());
    }
}