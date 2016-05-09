package org.usfirst.frc.team5026.robot.subsystems;

import org.usfirst.frc.team5026.robot.Robot;
import org.usfirst.frc.team5026.robot.commands.JoystickArcadeDrive;

import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.command.Subsystem;

public class Drive extends Subsystem {
	private RobotDrive driveRobot;
	
	public Drive() {
		driveRobot = new RobotDrive(Robot.hardware.leftTalon, Robot.hardware.rightTalon);
	}
	
	public void useArcadeDrive(double xAxis, double yAxis) {
		driveRobot.arcadeDrive(xAxis, yAxis);
	}
	
	public void setDriveMotors(double leftMotor, double rightMotor) {
		driveRobot.setLeftRightMotorOutputs(leftMotor, rightMotor);
	}
	
	public void stopDriveMotors() {
		driveRobot.setLeftRightMotorOutputs(0, 0);
	}

	@Override
	protected void initDefaultCommand() {
		setDefaultCommand(new JoystickArcadeDrive(Robot.hardware.robotJoystick));
	}
}
