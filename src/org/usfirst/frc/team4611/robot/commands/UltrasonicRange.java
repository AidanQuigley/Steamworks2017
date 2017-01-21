//Ultrasonic rangefinder V3 it works

package org.usfirst.frc.team4611.robot.commands;
import edu.wpi.first.wpilibj.AnalogInput;

import edu.wpi.first.wpilibj.smartdashboard.*; 





public class UltrasonicRange  {
	

	//public double raw_range;
	public static AnalogInput ultrasonicAnalog = new AnalogInput(3); //port number
	
	public int raw_range;
	public double raw_rangeVoltage;
	public double suppliedVolt = 5;
	public double voltsPerInch = suppliedVolt / 512;
	public double rangeInches;
	
    /*public void Init() 
    {
    	ultra.setAutomaticMode(true); // turns on automatic mode
    	ultra.startLiveWindowMode();
    	   	
    }*/
	public UltrasonicRange()
	{
		ultrasonicAnalog.setOversampleBits(8);
		ultrasonicAnalog.setAverageBits(5);
	}
    public void ultrasonicMeasurement() 
    {
    	double averageVoltage = ultrasonicAnalog.getAverageVoltage();	
    	double rangeInInches = 39.587242 * (averageVoltage) + 1.049719;
    	double roundedInches = rangeInInches + .5;
    	
    	SmartDashboard.putNumber("Ultrasonic Range", (int)roundedInches);
    	
    }
    

}
