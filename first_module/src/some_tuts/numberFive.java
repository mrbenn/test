package some_tuts;
import org.omg.CORBA.PUBLIC_MEMBER;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * User: benholdstock
 * Date: 28/04/2013
 * Time: 18:18
 * To change this template use File | Settings | File Templates.
 */
public class numberFive {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args){
        inputTest();
    }

    public static void inputTest(){
        String message = input.nextLine();
        System.out.println(Hello(message));
    }

    public static String Hello(String message){
        if (message.equals("Hi")){
            return "Hello";
        }else{
            return "Goodbye";
        }
    }

}
