package Fruit;

public class Fruit {
	protected String name;
	public Fruit(String name) {  //overloading with argument
		this.name = name;
		System.out.println("Fruit constructor is invoked");
		
	}


	public String getName() {
		return this.name;
	}
	
	public String toString() {  //overriding
	     return "\nFruit Name = "+name;
	   }

}
