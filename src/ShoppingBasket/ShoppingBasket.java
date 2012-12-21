package ShoppingBasket;

import java.util.*;

public class ShoppingBasket {
	
	ArrayList<Item> items=new ArrayList<Item>();
	double totalBill,totalTaxes;
	boolean initialized=true;
	public ShoppingBasket(int option)
	{

		switch(option)
		{
			case 1:
				items.add(new Item("book",12.49,1,true,false));
				items.add(new Item("music CD",14.99,1,false,false));
				items.add(new Item("chocolate bar",0.85,1,true,false));
				break;
			case 2:
				items.add(new Item("imported box of chocolates",10.00,1,true,true));
				items.add(new Item("imported bottle of perfume",47.50,1,false,true));
				break;
			case 3:
				items.add(new Item("imported bottle of perfume",27.99,1,false,true));
				items.add(new Item("bottle of perfume",18.99,1,false,false));
				items.add(new Item("packet of headache pills",9.75,1,true,false));
				items.add(new Item("box of imported chocolates",11.25,1,true,true));
				break;
			default:
				initialized=false;
				System.out.println();
				System.out.println("Invalid Option. Try Again.");
				System.out.println();
		}
		
	}
	
	public double getBill(){ return this.totalBill;}
	public double getTaxes(){ return this.totalTaxes;}
	public boolean getInitialized(){ return this.initialized;}
	
	public void printItems() {
		Iterator<Item> it = items.iterator();
		while(it.hasNext())
		{
			Item item=it.next();
			System.out.printf(item.getQuantity()+" "+item.getitemName()+": %.2f\n",item.getfinalPrice());
		}
	}

	public void calculatetotalBills() {
		Iterator<Item> it = items.iterator();
		while(it.hasNext())
		{
			totalBill+=it.next().getfinalPrice();
		}		
	}

	public void calculateTaxes() {
		Iterator<Item> it = items.iterator();
		while(it.hasNext())
		{
			totalTaxes+=it.next().calculateTax();
		}	
			
	}


}
