package lab7;

public class Toaster extends Product implements Cooker  {
	
	public String prepareFood() {
		return "prepareFood";
	}
	
	@Override
	public String getName() {
		return "Food's Name";
	}

}
