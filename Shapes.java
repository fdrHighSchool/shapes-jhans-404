import java.util.*;

public class Shapes{
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Enter in the square's side measure: ");
    double side = input.nextDouble();

    System.out.println("That square has an area of " + square(side));

    System.out.print("Enter in another square's side measure: ");
    double side2 = input.nextDouble();

    System.out.println("This square has an area of " + square(side2));

    System.out.print("Enter the base of the triangle: ");
    double base = input.nextDouble();
    System.out.print("Enter the height of the triangle: ");
    double height = input.nextDouble();

    System.out.println(triangle(base, height));

    System.out.print("Enter the height of the triangular prism: ");
    double pHeight = input.nextDouble();

    System.out.println(prism(triangle(base, height), pHeight));

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
    //System.out.println("A square with side " + s + " has an area of " + a);

    return a;
  }//close square method

  public static double triangle(double b, double h){
    //area = (b * h)/2
    double a = (b * h) / 2;

    return a;
  }//end triangle method

  public static double prism(double aBase, double h){
    return aBase * h;
  }//double prism

}//end class
