package carmain;

import java.util.ArrayList;

public class avgspeed {
     public static void averageofcarspeed(ArrayList<Car> carlist)
    {
        int greater=150;

    for(Car s : carlist)
    {
        if(s.avgspeed>150)
        {
            System.out.println(s.getAvgspeed());

        }
        else
        {
            System.out.println("Average speed is below 150");

        }
    
    }

    }

}
