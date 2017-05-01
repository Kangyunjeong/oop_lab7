package lab7;

public class SmartTV extends Product {
	
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
		// TODO Auto-generated method stub
		return null;
	}

}
