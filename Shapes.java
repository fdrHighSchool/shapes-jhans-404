import java.util.*;

public class Shapes{
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Enter the side length: ");
    double side = input.nextDouble();

    square(side);
  }//end main method

  /*
   * N: square
   * P: to calculate the area of any square
   * I: a side measure (double)
   * R: the area
   */
  public static double square(double s){
    //area = side times side
    double a = s * s;

    //generate some output
    System.out.println("A square with side " + s + " has an area of " + a);

    return a;
  }//close square method

}//end class
