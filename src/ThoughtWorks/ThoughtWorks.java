package ThoughtWorks;

import java.util.*;

import ShoppingBasket.ShoppingBasket;

public class ThoughtWorks {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
		while(true)
		{
			System.out.println("Please type which input set you want to test(1,2,3), Exit(Type 0): ");
			int option=scan.nextInt();
			if(option==0){break;}
			else 
			{		
				ShoppingBasket sb=new ShoppingBasket(option);
				if(!sb.getInitialized()){continue;}
				sb.calculateTaxes();
				sb.calculatetotalBills();
				sb.printItems();
				System.out.printf("Sales Taxes: %.2f\n",(double)Math.round(sb.getTaxes()*100)/100);
				System.out.printf("Total: %.2f\n",(double)Math.round(sb.getBill()*100)/100);
				System.out.println();
			}		
		
		
		}
		
		scan.close();
		
		System.out.println("Done.");
		
	}

}
