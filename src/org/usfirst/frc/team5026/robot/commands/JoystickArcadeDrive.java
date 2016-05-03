package org.usfirst.frc.team5026.robot.commands;

import org.usfirst.frc.team5026.robot.Robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.command.Command;

public class JoystickArcadeDrive extends Command {
	
	private Joystick joystick;
	
	public JoystickArcadeDrive(Joystick joystick) {
		requires(Robot.drive);
		this.joystick = joystick;
	}

	@Override
	protected void initialize() {
		Robot.drive.stopDriveMotors();
	}

	@Override
	protected void execute() {
		Robot.drive.useArcadeDrive(joystick.getX(), joystick.getY());
	}

	@Override
	protected boolean isFinished() {
		return false;
	}

	@Override
	protected void end() {
		Robot.drive.stopDriveMotors();
	}

	@Override
	protected void interrupted() {
		end();
	}

}
