public class Product{
	private static int id=0;
	private String productId;
	private String productName;
	private int productQuantity;
	private double productPrice;
	private String productCategory;

	public Product(String productName,int productQuantity,double productPrice,String productCategory){
		this.productId="PRODUCT-"+id++;
		this.productName=productName;
		this.productQuantity=productQuantity;
		this.productPrice=productPrice;
		this.productCategory=productCategory;
	} 

	public String getProductId(){
	return productId;
	}
	
	public String getProductName(){
	return productName;	
	}
	
	public void setProductName(String productName){
	this.productName=productName;
	}
	
	public int getProductQuantity(){
	return productQuantity;
	}

	public void setProductQuantity(int productQuantity){
	this.productQuantity=productQuantity;
	}

	public double getProductPrice(){
	return productPrice;
	}

	public void setProductPrice(){
	this.productPrice=productPrice;
	}
	
	public String getProductCategory(){
	return productCategory;
	}

	public void setProductCategory(){
	this.productCategory=productCategory;
	}

	public void displayProduct(){
		System.out.printf("%-10s %-20s %-10d %-10.2f %-15s\n", productId, productName, productQuantity, productPrice, productCategory);
	}
}