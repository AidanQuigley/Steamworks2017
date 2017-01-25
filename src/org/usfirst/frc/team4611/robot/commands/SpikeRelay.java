package org.usfirst.frc.team4611.robot.commands;

import edu.wpi.first.wpilibj.Relay;

public class SpikeRelay {
	public Relay spikeRelay;
	public void spike(){			
	spikeRelay = new Relay(1);
	spikeRelay.set(Relay.Value.kOn);
	}
}
