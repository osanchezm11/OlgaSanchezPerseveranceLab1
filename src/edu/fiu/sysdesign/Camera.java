/**
 * 
 */
package edu.fiu.sysdesign;

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
	public boolean checkForObstacle()
	{
		return true;
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

}
