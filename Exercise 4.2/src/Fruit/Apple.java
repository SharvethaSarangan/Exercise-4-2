package Fruit;


public class Apple extends Fruit {
	
	protected int quantity;
	protected double price;
	
	public Apple(String n , int q , double p) {
		super(n);
		this.quantity = q ;
		this.price = p ;
		
	System.out.println("Apple constructor in invoked");
	}
	
	public double caltotalprice() {  //overloading
	return this.price * this.quantity ;
}
	
	public String toString() {  // overriding
        return super.toString()+"\nQuantity = "+quantity+
        		                 "\nPrice per Kg = RM"+price+
        		                 "\nTotal Price= RM"+caltotalprice();
        
     }
	
}



