//import stuff here!
import java.util.Scanner;
//Your code here
class Calculator {
  public static void main(String[] args) {
    final double pi = 3.14159;
    Scanner inp = new Scanner(System.in);
    System.out.println("Enter the radius:");
    double radius = inp.nextDouble();
    double circumference = 2 * pi * radius;
    double area = (pi)*radius*radius;
    System.out.println("The Radius of the circle = " + radius);
    System.out.println("The Diameter of the circle = " + radius * 2);
    System.out.println("The Area of the circle = " + area);
    System.out.println("The Circumference of the circle = " + circumference);
  }
}



//Paste console output below:
/*
Enter the radius:
14.5
The Radius of the circle = 14.5
The Diameter of the circle = 29.0
The Area of the circle = 660.5192975
The Circumference of the circle = 91.10611


*/
