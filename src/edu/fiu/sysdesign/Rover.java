/**
 * 
 */
package edu.fiu.sysdesign;

/**
 * @author Olga
 * 
 * This is the main class of the project. 
 * The rover can be controlled from this class. 
 *
 */
public class Rover 
{
	String name;
	int weight;
	int dimension;
	String purpose;

	/**
	 * This method can be used to power on the rover
	 * Will return true if rover is powered on
	 * @return
	 */
	public boolean powerOn()
	{
		System.out.println("Rover powering on...");
		return true;
	}
	
	/**
	 * This method can be used to power off the rover
	 * Will return true if the rover is powered off
	 * @return
	 */
	public boolean powerOff()
	{
		System.out.println("Task completed successfully! Rover powering off...");
		return true;
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		Rover rover = new Rover();
		Command command = new Command();
		Cpu cpu = new Cpu();
		NavigationSystem navigationSystem = new NavigationSystem();
		Wheel wheel = new Wheel();
		Antenna antenna = new Antenna();
		Camera camera = new Camera();
		
		PerformPrimaryTask(command);
		System.out.println("");
		
		
		boolean isReceived = antenna.receiveData();
		if (isReceived)
		{
			PerformSecondaryTask(command, rover, 
				 navigationSystem, wheel, cpu, camera);
		}
		else
		{
			boolean isAntennaWorking = antenna.runSelfCheck();
			if (isAntennaWorking)
			{
				PerformSecondaryTask(command, rover, 
						 navigationSystem, wheel, cpu, camera);
			}
			else
			{
				System.out.println("Unexpected error occurred. Please perform a hard reset!");
			}
		}
	}
	
	public static void PerformPrimaryTask(Command command)
	{	
		Engineer engineer = new Engineer("Olga Sanchez", command);
		engineer.issueCommand();
	}
	
	public static void PerformSecondaryTask(Command command, Rover rover, 
			NavigationSystem navigationSystem, Wheel wheel, Cpu cpu, Camera camera)
	{
		PerformHappyPath(command, rover, navigationSystem, wheel, cpu);
		Photo photo = camera.takePhoto();
		PerformNotSoHappyPath(rover, navigationSystem, camera, photo, wheel);
	}
	
	public static void PerformHappyPath(Command command, Rover rover, 
			NavigationSystem navigationSystem, Wheel wheel, Cpu cpu)
	{
		
		cpu.processCommand(command);		
		rover.powerOn();
		cpu.activateNavigationSystem();		
		navigationSystem.calculateRoute();		
		wheel.moveForward(5);
	}
	
	public static void PerformNotSoHappyPath(Rover rover, NavigationSystem navigationSystem, 
			Camera camera, Photo photo, Wheel wheel)
	{
		boolean repeat = false;
		do
		{
			repeat = camera.checkForObstacle(photo);
			if (repeat)
				wheel.avoidObstacle();
		}
		while(repeat);
		rover.powerOff();
	}
	
	public static void delay(int ms)
	{
		try {
			Thread.sleep(ms);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
