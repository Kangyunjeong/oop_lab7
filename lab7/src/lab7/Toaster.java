package lab7;

public class Toaster extends Product implements Cooker  {
	
	public String prepareFood() {
		return "Toast";
	}
	
	@Override
	public String getName() {
		return "Food's Name";
	}
 
}
