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
public class numberSix {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args){
        //countNumber();
        compareStrings();
    }


    public static void countNumber(){
        int i = 0;
        while ( i <= 100){
            System.out.println(i);
            i++;
        }
    }

    public static void compareStrings(){
        String x = "Brandon";
        String y = "88888";
        if (!x.equals(y)){
            System.out.println("x does not equal y.");
        }else{
            System.out.println("x does equal y.");
        }

    }

}
