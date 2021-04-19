package edu.fiu.sysdesign;
/**
 * Contains details of navigation system
 * @author Olga
 *
 */
public class NavigationSystem 
{
	String type;
	
	public void calculateRoute()
	{
		System.out.println("Calculating route...");
		delay(1000);
		System.out.println("Best route identified");
		delay(5000);
		activateSmartDrive();
	}
	
	public void activateSmartDrive()
	{
		System.out.println("Smart drive system activated\n");
	}
	
	public void calculateAlternateRoute()
	{
		System.out.println("Calculating alternate route...");
		delay(1000);
		System.out.println("Alternate route identified\n");
		delay(5000);
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
