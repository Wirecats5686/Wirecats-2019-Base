package frc.robot.triggers;

import frc.robot.GamepadTriggerPOVMap;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Trigger;
/**
 * This is the trigger to shoot the cargo into a rocket slot
 */
public class LowShootTrigger extends Trigger {

    private Joystick gamepad;

    public LowShootTrigger (Joystick joystick) {
        gamepad = joystick;
    }
    
    /**
     * Determine if trigger is being pressed
     * getRawAxis(3) represents right trigger on gamepad
     * @return true if trigger is activated, else false
     */
    public boolean get() {
        return gamepad.getRawAxis(GamepadTriggerPOVMap.rightTrigger) != 0;
    }
}