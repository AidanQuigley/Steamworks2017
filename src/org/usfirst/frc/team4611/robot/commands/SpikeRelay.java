package org.usfirst.frc.team4611.robot.commands;
import org.usfirst.frc.team4611.robot.Robot;

import org.usfirst.frc.team4611.robot.RobotMap;

import edu.wpi.first.wpilibj.Relay;

public class SpikeRelay {
	public Relay spikeRelay;	
	boolean buttonState = Robot.oi.testButton.get();
	
	public void spike(){			
		spikeRelay = new Relay(RobotMap.spikeRelay);
		spikeRelay.set(Relay.Value.kOff);
		
		if(buttonState  == false){
			spikeRelay.set(Relay.Value.kOff);
		}else{
			spikeRelay.set(Relay.Value.kOn);
		}
	}
}
		


