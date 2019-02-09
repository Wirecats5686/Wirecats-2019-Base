package frc.robot.triggers;

import frc.robot.Robot;
import frc.robot.GamepadTriggerPOVMap;
import edu.wpi.first.wpilibj.buttons.Trigger;

/**
 * Maps trigger to POV of gamepad and determines whether up arrow on POV pressed
 */
public class ArmUp extends Trigger {
    
    public boolean get() {
        return Robot.oi.getGamepad().getPOV() == GamepadTriggerPOVMap.povUp;
    }
}