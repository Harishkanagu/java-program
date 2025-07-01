import  java.util.*;
public class oddeven {
    public static void main(String[] args) {
        System.out.print("Enetr the Number:");

        Scanner scane=new Scanner(System.in);
        int num1=scane.nextInt();
        if (num1%2==0) {
            System.out.println("The given number is even:");
        } 
        else {
            System.out.println("The given number is odd:"
            );

        }
    }
    
}
