package carmain;

import java.util.ArrayList;

public class carutil { 
    public  static void printofcarname(ArrayList<Car> carlist)
    {
        for (Car s : carlist) {
            System.out.println("Car name"+ s.getname());
            
        }
    }
    public static void printofcarmodel(ArrayList<Car> carlist)
    {
        for (Car s : carlist) {
            System.out.println("Car name"+ s.getmodelyear());
            
        }

    }
    public void printofcarprice(ArrayList<Car> carlist)
    {
        for (Car s : carlist) {
            System.out.println("Car name"+ s.getprice());
            
        }

    }


}
