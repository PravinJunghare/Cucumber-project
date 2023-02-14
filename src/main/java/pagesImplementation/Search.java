package pagesImplementation;

public class Search 
{
  public String displayProduct(Product prodcut) 
  {
	  
	  if(prodcut.getProductlist().contains(prodcut.getProductName()))
	  {
	  return prodcut.getProductName();
	  
  }
  return null;
}
}