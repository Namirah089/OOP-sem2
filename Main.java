public class Main{
	public static void main(String args[]){
		Product p1=new Product("Milk",5,350.5,"Grocery");

	System.out.printf("%-10s %-20s %-10s %-10s %-15s\n","ID","Name","Quantity","Price","Category");

	p1.displayProduct();
	}
}