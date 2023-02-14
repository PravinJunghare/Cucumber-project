package stepDefination;

import org.junit.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pagesImplementation.Product;
import pagesImplementation.Search;

public class SearchStep
{
	Product product;
	Search search;

	
	
	@Given("I have search field on amazon page")
	public void i_have_search_field_on_amazon_page() 
	{
	   System.out.println("Step1: I am on Search page");
	}



	@When("I search for a product with name {string} and price {int}")
	public void i_search_for_a_product_with_name_and_price(String productName, Integer price)
	{
		
		System.out.println("Step2: Search the product with name :" + productName +
				"+ price:" +price);
		
		product=new Product(productName, price);
	}



	@Then("Product with name {string} should be displayed")
	public void product_with_name_should_be_displaye(String productName)
	{
		System.out.println("Step3: Product "+productName+" is displayed ");
		
		search= new Search();
		String name=search.displayProduct(product);
		System.out.println("Product displayed "+name);
		Assert.assertEquals(product.getProductName(), name);
	} 




}
