package some_tuts;

/**
 * Created with IntelliJ IDEA.
 * User: benholdstock
 * Date: 28/04/2013
 * Time: 19:32
 * To change this template use File | Settings | File Templates.
 */
public class numberSevenTestClass {

    public static void main (String[] args){
        numberSeven numberSeven = new numberSeven(0);
        numberSeven.addWater(100);
        numberSeven.drinkWater(20);
        System.out.println("Your remaining water level is: " + numberSeven.getWater());
    }

}