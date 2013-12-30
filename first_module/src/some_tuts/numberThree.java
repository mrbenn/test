package some_tuts;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * User: benholdstock
 * Date: 28/04/2013
 * Time: 17:14
 * To change this template use File | Settings | File Templates.
 */
public class numberThree {
    static Scanner sc = new Scanner(System.in);
    public static void main (String[] args){

        // declare variables to hold the base and height
        double base;
        double height;
        // variables created, move on
        System.out.print("Enter the triangles base: ");
        base = sc.nextDouble();
        //base has been declared and filled in
        System.out.print("Enter the triangles height: ");
        height = sc.nextDouble();
        //both variables are filled in
        double preArea = base * height;
        //divide by 2
        double Area = preArea / 2;
        //all variables have done, the area has been calculated
        System.out.println("The area of your triangle: " + (Area));

    }

}
