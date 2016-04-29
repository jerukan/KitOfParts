package org.usfirst.frc.team5026.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.TalonSRX;

public class Hardware {
	public final TalonSRX leftTalon;
	public final TalonSRX rightTalon;
	public final Joystick robotJoystick;
	
	public Hardware() {
		leftTalon = new TalonSRX(Constants.leftDriveMotor);
		rightTalon = new TalonSRX(Constants.rightDriveMotor);
		
		robotJoystick = new Joystick(Constants.robotJoystickPort);
	}
}
