package some_tuts;
import java.util.Scanner;


/**
 * Created with IntelliJ IDEA.
 * User: benholdstock
 * Date: 28/04/2013
 * Time: 17:47
 * To change this template use File | Settings | File Templates.
 */
public class numberFour {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args){
        inputTest();

    }
    public static void inputTest(){
        String message = input.nextLine();
           if(message.equals("hi")){
               System.out.println("Hello!");
           }

    }

}
