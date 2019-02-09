package frc.robot.triggers;

import frc.robot.Robot;
import frc.robot.GamepadTriggerMap;
import edu.wpi.first.wpilibj.buttons.Trigger;

/**
 *
 */
public class ArmUp extends Trigger {
    
    public boolean get() {
        return Robot.oi.getGamepad().getPOV() == GamepadTriggerMap.armUpDegrees;
    }
}