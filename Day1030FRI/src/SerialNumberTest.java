class Product{
	static int number;
	int searialNumber;

	
	public Product() {
		searialNumber = ++number;
	}
}

public class SerialNumberTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Product product1 = new Product();
		Product product2 = new Product();
		Product product3 = new Product();
		
		System.out.println("product1.searialNumber => " + product1.searialNumber);
		System.out.println("product2.searialNumber => " + product2.searialNumber);
		System.out.println("product3.searialNumber => " + product3.searialNumber);
		

	}

}
