import java.util.Scanner;

public class ReplitShoppingList2 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String shoppingListReport = "";
		String item = "";
		String countinue = "";
		double price = 0;
		int count = 1;
		double totalPrice = 0;

		do {
			System.out.printf("Enter Item and its price:\n", count);
			item = scan.next();
			price = scan.nextDouble();
			shoppingListReport += ("Item" + count + ": " + item + " Price: " + price + ", ");
			totalPrice += price;
			System.out.println("Add one more item?");
			countinue = scan.next();
			count++;
		} while (countinue.equals("yes"));
		System.out.println(shoppingListReport.substring(0, shoppingListReport.length()-2));
		System.out.println("Total price: " + totalPrice);

		
		
		
		
		
		
		
		
		
	}

}
