import java.util.*;

public class Shapes{
  public static void main(String[] args) {

    double volume = cube(4);

    System.out.println("Cube volume: " + volume);

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

  public static double cube(double s){
    return(s * square(s));
  }//end cube method
}//end class
