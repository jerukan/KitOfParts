package org.usfirst.frc.team5026.robot.subsystems;

import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.command.Subsystem;

import org.usfirst.frc.team5026.robot.Hardware;

public class Drive extends Subsystem {
	private Hardware hardware;
	private RobotDrive drive;
	
	public Drive() {
		hardware = new Hardware();
		drive = new RobotDrive(hardware.leftTalon, hardware.rightTalon);
	}
	
	public void setDriveMotors(double leftMotor, double rightMotor) {
		drive.setLeftRightMotorOutputs(leftMotor, rightMotor);
	}
	
	public void stopDriveMotors() {
		drive.setLeftRightMotorOutputs(0, 0);
	}

	@Override
	protected void initDefaultCommand() {
		drive.arcadeDrive(hardware.robotJoystick);
	}
}
