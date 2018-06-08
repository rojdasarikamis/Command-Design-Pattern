package ceng.anadolu.bim492;

public class Stock {
	
	   private String name = "StockController";
	   private int quantity = 25;

	   public void buy (){
	      System.out.println("Stock Name: "+name+ ",  Quantity: " + quantity +"   < bought >");   
	      
	      System.out.println(" "); 
	      
	      System.out.println(".....................................................");  
	      System.out.println(" ");   
	   }
	   
	   
	   
	   public void sell (){
		   
		   
	      System.out.println("Stock Name: "+name+", Quantity: " + quantity +"     < sold >");
	      
	      System.out.println(" "); 
	   }
	}