package frc.robot.triggers;

import frc.robot.GamepadTriggerPOVMap;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Trigger;
/**
 * This is the trigger to shoot the cargo into a rocket slot
 */
public class LowShootTrigger extends Trigger {

    // Gamepad that has the trigger button we're interested in
    private Joystick gamepad;

    /**
     * Create a LowShootTrigger instance
     * @param joystick
     */
    public LowShootTrigger (Joystick joystick) {
        gamepad = joystick;
    }
    
    /**
     * Determine if right trigger on gamepad is being pressed by getting the value of axis 2
     * 
     * @return true if trigger is being pressed (value is not 0)
     */
    public boolean get() {
        return gamepad.getRawAxis(GamepadTriggerPOVMap.leftTrigger) != 0;
    }
}