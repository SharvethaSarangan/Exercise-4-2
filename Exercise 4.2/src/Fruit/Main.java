package Fruit;

public class Main {

		public static void main(String[] args) {
			
			Fruit obj  = new Fruit("Fruits");
			System.out.println(obj);
			
			Apple obj1= new Apple("Apple",3,5.50);
			System.out.println(obj1);
			
			GreenApple obj2 = new GreenApple("Green Apple" , 3 , 5.50, "Australia , Soth Africa" , "Year Around");
			System.out.println(obj2);
			
			Redapple obj3 = new Redapple("Red Apple" , 3, 5.50, "South Africa, New Zealand" , "October");
			System.out.println(obj3);
			
			Orange obj4 = new Orange("Orange" ,4, 8.80 , 80);
			System.out.println(obj4);
			
			Grapes obj5 = new Grapes("Grapes" , 2 , 10.00, 67);
			System.out.println(obj5);
			
			MoonDrops obj6 = new MoonDrops("Moon Dropes" , 5 , 16.00 , 70, "Central California" , "Late July to September");
			System.out.println(obj6);
			
			SweetJubilee obj7 = new SweetJubilee("Sweet Jubilee" , 4 , 25.00 , 65 , "Central California" , "Mid-August to early September");
			System.out.println(obj7);


		}

	}
