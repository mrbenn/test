package some_tuts;

/**
 * Created with IntelliJ IDEA.
 * User: benholdstock
 * Date: 28/04/2013
 * Time: 19:20
 * To change this template use File | Settings | File Templates.
 */
public class numberSeven {

    int tWater = 0; //water bottle level

    //default constructor for the object
    public numberSeven(){

    }

    //constructor with assigned water level if called instead of the default
    public numberSeven(int waterAmount){
    tWater = waterAmount = 50;
    }

    //customs methods on waterBottle object
    public void addWater(int amount){
        tWater = tWater + amount;
    }

    public void drinkWater(int amount){
        tWater = tWater - amount;
    }

    public int  getWater(){
        return tWater;
    }

}
