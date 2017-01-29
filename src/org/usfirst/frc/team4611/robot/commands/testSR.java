package org.usfirst.frc.team4611.robot.commands;
import org.usfirst.frc.team4611.robot.Robot;

import org.usfirst.frc.team4611.robot.RobotMap;

import edu.wpi.first.wpilibj.Relay;

public class testSR {
	public Relay spikeRelay;	
	boolean buttonState = Robot.oi.testButton.get(); //true= on, false =off (double check)
	
	public void spike(){			
		spikeRelay = new Relay(RobotMap.spikeRelay);
		spikeRelay.set(Relay.Value.kOff); //Value is off (default is off)
		
		if(buttonState  == false){ //if button is off
			spikeRelay.set(Relay.Value.kOff);//stay off
		}else{//if button is on
			spikeRelay.set(Relay.Value.kOn); //stay on
		}
	}
}
		


