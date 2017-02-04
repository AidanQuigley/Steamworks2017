package org.usfirst.frc.team4611.robot.subsystems;

import org.usfirst.frc.team4611.robot.RobotMap;
import org.usfirst.frc.team4611.robot.commands.SingleWheelShoot;

import com.ctre.CANTalon;

import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.command.Subsystem;

public class SingleWheelShooter extends Subsystem{
	
	private CANTalon singleWheelShooter;
	
	public SingleWheelShooter(){
		this.singleWheelShooter = new CANTalon (RobotMap.singleShooter);
	}
	public void shoot (double speed){
		this.singleWheelShooter.set(speed);
	}
	
	public void initDefaultCommand() {
        // Set the default command for a subsystem here.
    	//this.setDefaultCommand(new SingleWheelShoot());

    }
	}

