package org.usfirst.frc.team5026.robot.commands;

import org.usfirst.frc.team5026.robot.subsystems.Drive;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.command.Command;

public class JoystickArcadeDrive extends Command {
	
	private Joystick joystick;
	private Drive drive;
	
	public JoystickArcadeDrive(Joystick joystick) {
		drive = new Drive();
		this.joystick = joystick;
	}

	@Override
	protected void initialize() {
		
	}

	@Override
	protected void execute() {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected boolean isFinished() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	protected void end() {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void interrupted() {
		// TODO Auto-generated method stub
		
	}

}
