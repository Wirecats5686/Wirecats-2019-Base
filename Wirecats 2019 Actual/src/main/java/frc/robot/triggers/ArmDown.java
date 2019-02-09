package frc.robot.triggers;

import frc.robot.Robot;
import frc.robot.GamepadTriggerMap;
import edu.wpi.first.wpilibj.buttons.Trigger;

/**
 * Maps trigger to POV of gamepad and determines whether f
 */
public class ArmDown extends Trigger {
    
    public boolean get() {
        return Robot.oi.getGamepad().getPOV() == GamepadTriggerMap.armDownDegrees;
    }
}