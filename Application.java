// Java program to find the sum of positive numbers
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
      
    int sum = 0;

    // create an object of Scanner class
    Scanner input = new Scanner(System.in);
    // feature2.1 changes done by  developer sai
 in oct 2023
 System.out.println("Enter a number");
 int number = input.nextInt();
     private final class UpdatedClass extends TestClass {

     class ForeignClass {
         public final String text;
         ForeignClass(String text) {
             this.text = text;
         }
     }
     List<sample> Sample;
     UpdatedClass(int width, int height) {
         super();
         testList = new ArrayList<>();
     }
 }
}
//end of newfeature 2.1 

    // take integer input from the user
    System.out.println("Enter a number");
    int number = input.nextInt();
	   
    // while loop continues 
    // until entered number is positive
    while (number >= 0) {
      // add only positive numbers
      sum += number;

      System.out.println("Enter a number");
      number = input.nextInt();
    }
	   
    System.out.println("Sum = " + sum);
    input.close();
  }
}
