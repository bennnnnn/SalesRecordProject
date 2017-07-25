import java.util.Scanner;

public class SalesRecord{
	
	public static void main(String args []){
		 
		
		String customerName; // holds the customers name.
		double salesAmount; // holds the sales amount
        double taxDue = 0; // holds the tax amount
        int taxCode; // holds tax numbers 0, 1, 2
        double totalSales;  // holds the sales amount and the tax
	    Scanner scan = new Scanner(System.in);
	    
	    System.out.println("Enter cutomer name:");
	     customerName = scan.nextLine();
	    
	    System.out.println("Enter the sales amount");
	      salesAmount =scan.nextDouble();
	      
	     System.out.println( "Enter the tax number:");
	       taxCode =scan.nextInt();
	    
		if(taxCode==0)
			 System.out.println(" Tax exempt");
		else if(taxCode==1)
			taxDue =(3.0/100)*salesAmount;
		
		else if(taxCode==2)
			taxDue= 5.0/100*salesAmount;
		else
			System.out.println("you put wrong tax number.");
		    
		  
		totalSales=salesAmount+taxDue; // the total tax is the sum of the tax and the sales amount.
		
		System.out.println( "\tSales Report:\r\r");
		
		System.out.println( "\tCustomer Name: "+customerName);
		
	 
		System.out.println( "\tCustomer number :"+taxCode);
		
		 
		System.out.println( "\tSales Amount:"+salesAmount);
		System.out.println( "\tTax:    "+taxDue);
		System.out.println( " \tTotal sale  "+totalSales);
		
	}
}

 