package pagesImplementation;

import java.util.ArrayList;
import java.util.List;

public class Product

{
	
	String productName;
	int price;
	
	public Product(String productName, int price) 
	{
		
		this.productName = productName;
		this.price = price;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price)
	{
		this.price = price;
	}
	
	public List<String> getProductlist()
	{
		List<String> productList= new ArrayList<>();
		productList.add("Apple Macbook pro");
		productList.add("Iphone 13");
		return productList;
		
	}
 
}
