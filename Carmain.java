import java.util.ArrayList;
import java.util.Scanner;

import carmain.carutil;
import carmain.avgspeed;


public class Carmain{
    public int car_id=1;
    public String name;
    public int Avgspeed;
    public int modelyear;
    public int price;
    public Carmain(String name,int Avgspeed, int modelyear,int price){
        this.name=name;
        this.Avgspeed=Avgspeed;
        this.modelyear=modelyear;
        this.price=price;
    }
    public static void main(String[] args) {
        ArrayList<Car> carlist=new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int num1;
        System.out.println("you want to add Car Details press 1");
        num1 =scanner.nextInt();
        scanner.nextLine();

        while(num1==1){
            System.out.println("Enter the Car name :");
            String name= scanner.nextLine();
            System.out.println("Enter the Average speed of car");
            int Avgspeed=scanner.nextInt();
            scanner.nextLine();
            System.out.println("Enter the model year of the car");
            int modelyear=scanner.nextInt();
            scanner.nextLine();
            System.out.println("Enter the Price of the car:");
            int price=scanner.nextInt();
            num1=scanner.nextInt();
            carlist.add(new Car(name,Avgspeed,modelyear,price));



        }
        
        int num=1;
        while(num>5)
        {
            System.out.println("1:press one for display car name\n"+
            "2:press 2 for average greater than 150 \n"+
            "3:press 3 for model of the car\n"+
            "4:press 4 for price of the car\n"+
            "5:press 5 for Exit....");
            if (num==1)
            {
                carutil car_1 =new carutil();
                car_1.printofcarname(carlist);

            }
            else if (num==2) 
            {
                carutil car_2 =new carutil();
                car_2.printofcarmodel(carlist);                
            } 
            else if (num==3){
                avgspeed ags =new avgspeed();
                ags.averageofcarspeed(carlist);
            }
            else if(num==4){
                carutil car_3 =new carutil();
                car_3.printofcarprice(carlist);


            }
            else {
                System.out.println("Thank you!....");
            }
           


        }        


        
    }
}
