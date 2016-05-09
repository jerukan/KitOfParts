package org.usfirst.frc.team5026.robot;

import org.usfirst.frc.team5026.util.JoystickScaling;
import org.usfirst.frc.team5026.util.RobotJoystick;

import edu.wpi.first.wpilibj.CANTalon;
import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

public class Hardware {
	public CANTalon leftTalon;
	public CANTalon rightTalon;
	public final RobotJoystick robotJoystick;
	public final Encoder leftEncoder;
	public final Encoder rightEncoder;
	public final JoystickButton button1;
	
	public Hardware() {
		leftTalon = new CANTalon(Constants.leftDriveMotor);
		rightTalon = new CANTalon(Constants.rightDriveMotor);
		
		robotJoystick = new RobotJoystick(Constants.robotJoystickPort, Constants.xDeadzone, Constants.yDeadzone, Constants.motorDeadzone, JoystickScaling.HALVED);
		button1 = new JoystickButton(robotJoystick, 1);
		
		
		leftEncoder = new Encoder(Constants.leftDriveEncoder1, Constants.leftDriveEncoder2);
		rightEncoder = new Encoder(Constants.rightDriveEncoder1, Constants.rightDriveEncoder2);
	}
}
