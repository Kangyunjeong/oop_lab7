package lab7;

public class SmartTV extends Product implements Networked {
	
	private int channel;
	
	public boolean isConnected()
	{
		return false;
		
	}
	
	public double maxSpeed()
	{
		return channel;
		
	}
	
	

	public int getChannel() {
		return channel;
	}

	public void setChannel(int channel) {
		this.channel = channel;
	}

	@Override
	public String getName() {
		
		return null;
	}

}
