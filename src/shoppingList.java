import java.util.Scanner;

public class shoppingList {
	
	public static void main(String[] args) {
		
//		Object Scanner;
//		Example:


//			```
//			output: Enter Item1 and its price:
//			input: Tomatoes
//			input: 5.5
//			output: Add one more item?
//			input: yes
//			output: Enter Item2 and its price:
//			input: Cheese
//			input: 3.5
//			output: Add one more item?
//			input: yes
//			output: Enter Item3 and its price:
//			input: Apples
//			input: 6.3
//			output: Add one more item?
//			input: no
//			output: Item1: Tomatoes Price: 5.5, Item2: Cheese Price: 3.5, Item3: Apples Price: 6.3
//			output: Total price: 15.3
//			```
			
			
			 Scanner scan = new Scanner(System.in);
			 
		do {
			
			 System.out.println("Please enter item1 and its price :");
			 String item = scan.next();
				double price = scan.nextDouble();
				String count;
				Object shoppingListReport = ("Item" + count + ": " + item + " Price: " + price + ", ");
				double totalPrice = price;
				System.out.println("Add one more item?");
				String countinue = scan.next();
			 shoppingListReport += ("Item" + count + ": " + item + " Price: " + price + ", ");
			 
			 System.out.println("Please enter item2 and its price :");
			 
			 String item2 = scan.next();
			 double price2 = scan.nextDouble();
			 
			 System.out.println("Please enter item3 and its price :");
			 
			 String item3 = scan.next();
			 double price3 = scan.nextDouble();
			
			 System.out.println("Do you want to add more? ");
			 
			 String answer = scan.next();
			 answer++;
			
			
		} while (answer.equals("yes"));	 
			 
		 System.out.println(item1 + "Price: " + price1 + "," + item2 + "Price: " + price2 + "," + item3 + "Price: "  + price3 );
			 
			 
			 
			 
		}

}
	
	
