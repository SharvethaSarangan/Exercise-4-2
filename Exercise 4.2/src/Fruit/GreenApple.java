package Fruit;

public class GreenApple extends Apple {
	
	private String place;
	private String season;
	
	public GreenApple(String n , int q , double p, String g , String s) {
		super(n ,q , p);
		this.place = g;
		this.season = s;
	    }
		

	public String Growingplace() {
	return this.place;
	}
	
	public String Season() {
	return this.season;
	}
	
    public double caltotalprice() {
	return this.price * this.quantity ;
    }
	
	
	public String toString() { // overriding
        return super.toString()+"\nQuantity = "+ quantity+
        		                 "\nPrice per Kg = RM"+ price+
        		                 "\nMoon Drops will grow at : " + place +
        		                 "\nSeason : " + season +
        		                 "\nTotal Price= RM"+caltotalprice();
        	
}
}
