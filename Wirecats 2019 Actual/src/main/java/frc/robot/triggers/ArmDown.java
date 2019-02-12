package frc.robot.triggers;

import frc.robot.Robot;
import frc.robot.GamepadTriggerPOVMap;
import edu.wpi.first.wpilibj.buttons.Trigger;

/**
 * Maps trigger to POV of gamepad and determines whether down arrow on POV pressed
 */
public class ArmDown extends Trigger {
    
    public boolean get() {
        return true;
        // return Robot.oi.getGamepad().getPOV() == GamepadTriggerPOVMap.povDown;
    }
}