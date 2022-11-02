import java.util.Scanner;

public class Carpma {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int num1,num2;
		num1=scan.nextInt();
		num2 = scan.nextInt();
		
		int returnAnswer = multiple(num1,num2);
		System.out.println(returnAnswer);
		
		
	}
	
	
	public static int multiple(int num1, int num2) {
	
	int answer;
	answer = num1 * num2;
	return answer;

	}
	

}
