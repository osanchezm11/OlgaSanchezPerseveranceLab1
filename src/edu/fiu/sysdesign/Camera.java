/**
 * 
 */
package edu.fiu.sysdesign;

import java.util.Random;

/**
 * @author Olga
 *
 */
public class Camera implements SelfCheckCapable 
{
	String type;
	int resolution;
	int zoom;
	
	/**
	 * This method will perform the action of
	 * taking a photo and returning that back.
	 * @return
	 */
	public Photo takePhoto()
	{
		Photo photo = new Photo();
		System.out.println("Taking photo of surroundings...");
		delay(1500);		
		return photo;
	}
	
	/**
	 * This method will perform the action of
	 * recording a video and return that.
	 */
	public void recordVideo()
	{
		
	}
	
	/**
	 * This method will check if any obstacle is present
	 * and return true if yes and return false if no.
	 * @return
	 */
	public boolean checkForObstacle(Photo photo)
	{
		System.out.println("Analyzing photos and sensor data...");
		delay(1500);
		if (threatOrNot())
		{
			System.out.println("Obstacle identified as a threat\n");
			return true;
		}
		else
		{
			System.out.println("Obstacle is not a threat. Can continue moving forward towards destination...");
			delay(1500);
			System.out.println("Destination reached\n");
			delay(800);
			return false;
		}
	}

	@Override
	public String getComponentName() 
	{
		// TODO Auto-generated method stub
		return "camera status";
	}

	@Override
	public boolean selfCheck() 
	{
		// TODO Auto-generated method stub
		return SelfCheckUtils.randomCheck(0.14);
	}

	@Override
	public boolean runSelfCheck() 
	{
		// TODO Auto-generated method stub
		return SelfCheckUtils.basicSelfCheckRunner(this);
	}
	
	public boolean threatOrNot()
	{
		Random rand = new Random();
		return rand.nextBoolean();
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
