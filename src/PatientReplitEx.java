import java.util.Scanner;
class PatientReplitEx {
  public static void main(String[] args) {
    //Enter your code here
    int age, zipcode;
    double height,weight;
    boolean isMarried;
    long workPhoneNumber,PersonalPhoneNumber;

    Scanner scan = new Scanner(System.in);
    System.out.println("Welcome to the patient portal!");
    System.out.println("Please enter your personal information");
    System.out.println("Enter your frist name:");
    String firstName = scan.nextLine();
    System.out.println("Enter your last name");
    String lastName = scan.nextLine();
   // this part is already provided DO NOT CHANGE
   System.out.println("Enter your email");
   String email = scan.nextLine();
   System.out.println("Enter your street");
   String street = scan.nextLine();
     // continue for city
   System.out.println("Enter your city");
   String city = scan.nextLine();
   System.out.println("Enter your state");
   String state = scan.nextLine();
   System.out.println("Enter your zip code");
   zipcode = scan.nextInt();
   System.out.println("Enter your work phone number");
   workPhoneNumber = scan.nextLong();
   System.out.println("Enter your personal phone number");
   PersonalPhoneNumber = scan.nextLong();
   System.out.println("Enter your age");
   age = scan.nextInt();
   System.out.println("Enter your height");
   height = scan.nextDouble();
   System.out.println("Enter your weight");
   weight = scan.nextDouble();
   System.out.println("Are you married");
   isMarried = scan.nextBoolean();
   

   
   System.out.println("Full name: " + lastName + ", " + firstName);
   System.out.println("Address: " + street + "," + state + ", " + zipcode);
   System.out.println("Contacts: work phone number - " + workPhoneNumber + "," + PersonalPhoneNumber + "," + "email: " + email);
   System.out.println("Age: " + age);
   System.out.println("Height: " + height);
   System.out.println("Weight: " + weight + " pounds");
   System.out.println("Merried?: " + isMarried);
   
   
// *Output in the console:**
//
// Patient personal information
// Full name: May, James
// Address: 7925 Jones Branch Dr, McLean, VA 22102
// Contacts: work phone number - 7896542314, personal phone number - 2406542314,  email: jamesmay@gmail.com
// Age: 35
// Height: 5.1
// Weight: 173.2 pounds
// Married?: true
   

   
   
   
   
   
   
   
   
   
   
   
   
   

    
  }
}