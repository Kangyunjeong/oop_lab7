package lab7;

public class ProductTest {

	public static void main(String[] args) {
		
		ProductTest pt = new ProductTest();
		
		Product pro = new SmartTV();
		DataStorage data = new Laptop();
		Networked net = new SmartTV();
		Cooker cook = new Toaster();
		
		pt.testProduct(pro);
		pt.testDataStorage(data);
		pt.testNetworked(net);
		pt.testCooker(cook);

	}
	
	public void testProduct (Product product){
		double a;
		product.setPrice(100);
		a= product.getPrice();
		System.out.println(a);
	}
	
	public void testDataStorage(DataStorage dataStorage){
		
		double b;
		b= dataStorage.getFreeCapacity();
		System.out.println(b);
	}
	
	public void testNetworked(Networked networked){
		
		double c;
		c = networked.maxSpeed();
		System.out.println(c);
	}
	
	public void testCooker(Cooker cooker){
		String s;
		s=cooker.prepareFood();
		System.out.println(s);
		
	}
	

}
