import java.util.*;
public class Main {
  public static void main(String[] args) {
     //DO NOT TOUCH THESE LINES. TEACHER NEEDS THEM TO TEST YOUR CODE:
    // Variables are already declared and given
    Scanner s = new Scanner(System.in);
    int num = s.nextInt();

    //your code here

    if (num < 0) {
      System.out.println(num + " is negative");
      
}
    else if (num > 0) {
  System.out.println(num +" is positive");
      
    }
   else{
     System.out.println(num + "is zero");
   }
     
    
    

    
  }
}