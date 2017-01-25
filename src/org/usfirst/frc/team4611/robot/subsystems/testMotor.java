package org.usfirst.frc.team4611.robot.subsystems;

import org.usfirst.frc.team4611.robot.Robot;

import edu.wpi.first.wpilibj.AnalogInput;
import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.command.Subsystem;

public class testMotor extends Subsystem{

Victor buttMotor = new Victor(1);

public static DigitalInput motorDigital = new DigitalInput(2); 
double buttVal1;
protected void execute() {
    boolean buttVal = motorDigital.get();
    if (buttVal){
    	double buttVal1 = 1.0;
    }else{
    	double buttVal1 = 0.0;
    }
    if(buttVal){

		Robot.rightS.move(buttVal1);
    }
}





@Override
protected void initDefaultCommand() {
	// TODO Auto-generated method stub
	
}

}
