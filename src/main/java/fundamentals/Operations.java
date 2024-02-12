package fundamentals;

import java.util.Scanner;

public class Operations {
  public void calculateArea(){
      // declare variables
      Scanner scanner = new Scanner(System.in);  // Create a Scanner
      int length;
      int width;

      // read variables
      System.out.println("Enter length ");
      length = scanner.nextInt();

      System.out.println("Enter width ");
      width = scanner.nextInt();

      // calculate area
      int area = length * width;

      System.out.println("Area of rectangle: " + area );
  }

    public  void  numberOperations(){
        int number1 = 27;
        int number2 = 5;
        int sum = number1 + number2;
        int diff = number1 - number2;
        int prod = number1 * number2;
        int div = number1 % number2;
        int last_decimal = number1 %10;


        System.out.println("Sum is: \t" + sum);
        System.out.println("Diff is: \t" + diff);
        System.out.println("Prod is \t" + prod);
        System.out.println("Div is: \t" + div);
        System.out.println("Last decimal is: \t" + last_decimal );

    }
}
