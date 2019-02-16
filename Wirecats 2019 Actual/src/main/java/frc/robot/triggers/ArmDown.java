package frc.robot.triggers;

import frc.robot.GamepadTriggerPOVMap;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Trigger;

/**
 * Maps trigger to POV (directional pad) of gamepad and determines 
 * whether down arrow on POV is pressed
 */
public class ArmDown extends Trigger {
    
    // Gamepad that has the POV we're interested in
    private Joystick gamepad;

    /**
     * Create an instance of ArmDown trigger
     * @param joystick
     */
    public ArmDown(Joystick joystick) {
        gamepad = joystick;
    }

    /**
     * Returns true (indicating trigger is active) when down is 
     * pressed on the gamepad's directional pad
     */
    public boolean get() {
        return gamepad.getPOV() == GamepadTriggerPOVMap.povDown;
    }
}