package ShoppingBasket;

public class Item {

	private String itemName;
	private double  itemPrice;
	private int quantity;
	private boolean isExempted=false;
    private boolean isImported=false;
    private double  finalPrice;
	private double  tax;  
 
	private static final double roundOFF=0.05;
	private static final double fixedrateTax= 0.10;
	private static final double importedTax= 0.05;
	
    public Item(String name, double  price, int quantity, boolean isExempted, boolean isImported)
    {
    	this.itemName=name;
    	this.itemPrice=price;
    	this.quantity=quantity;
    	this.isExempted=isExempted;
    	this.isImported=isImported;
    	
    }
    
    public String getitemName(){ return this.itemName;}   
    public double  getfinalPrice(){ return this.finalPrice;}
    public int getQuantity(){ return this.quantity;}
 
    private void setfinalPrice() {
		this.finalPrice=this.itemPrice+this.tax;
		this.finalPrice=(double)Math.round(this.finalPrice*100)/100;
	}
    
    public double calculateTax()
    {
    	if(!this.isExempted)
    	{
    		this.tax+=this.itemPrice*fixedrateTax;
    	}
    	    	
    	if(this.isImported)
    	{
    		this.tax+=this.itemPrice*importedTax;
    	}
     	
     	this.tax=(double)Math.ceil(this.tax/roundOFF)*roundOFF;    
     	setfinalPrice();

    	return this.tax;
    }
    
}
