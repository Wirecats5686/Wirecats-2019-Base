//this is where the subsystem code for the arm will go
package frc.robot.subsystems;

import frc.robot.RobotMap;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.commands.RunArm;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import edu.wpi.first.wpilibj.command.Subsystem;

public class Arm extends Subsystem{
    private static DigitalInput down;
	private static DigitalInput up;
	
	private static Talon arm_motor_a;
	private static Talon arm_motor_b;

    public Arm(){
        super("Arm");
        //numbers are placeholders and will be replaced with proper port numbers
        //see if we can use the robot map
		arm_motor_a = new Talon(6);
		arm_motor_b = new Talon(7);
		
		down = new DigitalInput(9);
		up = new DigitalInput(1);

    }

    public void initDefaultCommand() {
        setDefaultCommand(new RunArm(true));
	}
	
    public void set(double speed){
		if(getUpSwitch() && speed < 0){
			setBoth(0);
		}else if(getDownSwitch() && speed > 0){
			setBoth(0);
		}else{
			speed *= 0.3;
			
			setBoth(speed);
		}
	}
		
	private void setBoth(double speed){
		arm_motor_a.set(speed);
		arm_motor_b.set(speed);
	}
	
	public boolean getDownSwitch(){
		return !down.get();
	}
	
	public boolean getUpSwitch(){
		return !up.get();
	}

	public void stop(){
		set(0);
	}
}

    


