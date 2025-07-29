
import java.util.Scanner;

public class CurrencyConverter {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Welcome to Currency Converter!");
		System.out.println("1. USD to Rupee");
		System.out.println("2. Rupee to USD");
		System.out.println("3. Euro to Rupee");
		System.out.println("4. Rupee to Euro");
		System.out.print("Enter your choice (1 or 2 or 3 or 4): ");
	    int choice = sc.nextInt();
	    
	    if(choice==1) {
	    	System.out.print("Enter the amount in USD: ");
            double USD = sc.nextDouble();
            double Rupee = euroToRupee(USD);
            System.out.println("Converted amount in Rupee: " + Rupee);
	    	
	    }
	    else if(choice==2) {
	    	System.out.print("Enter the amount in Rupee: ");
            double Rupee = sc.nextDouble();
            double USD = RupeeToEuro(Rupee);
            System.out.println("Converted amount in Rupee: " + USD);
	    	
	    }
	    else if (choice == 3) {
            System.out.print("Enter the amount in EURO: ");
            double EURO= sc.nextDouble();
            double Rupee = euroToRupee(EURO);
            System.out.println("Converted amount in USD: " +Rupee);
	    } 
	    else if (choice == 4) {
	        System.out.print("Enter the amount in Rupee: ");
	        double Rupee = sc.nextDouble();
	        double EURO = RupeeToEuro(Rupee);
	        System.out.println("Converted amount in USD: " +EURO);
	    }
	   
	    else {
	        System.out.println("Invalid choice. Please select 1 or 2 or 3 or 4.");
	    }
	
		sc.close();
	}
	public static double usdToRupee(double USD) {
        return USD * 86.94;  // today 13/03/2025  price
    }
    public static double RupeeToUsd(double Rupee) {
        return Rupee *0.012;   // today 13/03/2025  price
    }
    public static double euroToRupee(double EURO) {
        return EURO *94.46;   // today 13/03/2025  price
    }
    public static double RupeeToEuro(double Rupee) {
        return Rupee *0.011;   // today 13/03/2025  price
    }
	

}
	
