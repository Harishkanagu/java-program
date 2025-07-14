package abstracts;

import java.util.*;

class Square extends Shape {

    public void Areaofshape() {
        Scanner scanner = new Scanner(System.in);
        int num;
        do {

            System.out.println("1.press 1 for area of circle:\n"
                    + "2.press 2 for area of square:\n"
                    + "3.press 3 for area of rectangle:\n"
                    + "4.Exit...");
            System.out.println("Enter the choice:");
            num = scanner.nextInt();
            if (num == 1) {
                System.out.print("Enter the radius of circle:");
                double r = scanner.nextDouble();
                double area = 2 * 3.14 * r;
                System.out.println("Area of the circle:" + area);
            } else if (num == 2) {
                System.out.print("Enter the value length of square:");
                int a = scanner.nextInt();
                double area = a * a;
                System.out.println("Area of the Square:" + area);

            } else if (num == 3) {
                System.out.print("Enter the length of Rectangle:");
                int l = scanner.nextInt();
                System.out.print("Enter the breath of the Rectangle:");
                int b = scanner.nextInt();
                int area = l * b;
                System.out.println("Area of the Rectangle:" + area);
            } else {
                break;
            }
        } while (num < 5);
    }

}

public class Main {

    public static void main(String[] args) {
        Shape m = new Square();
        m.Areaofshape();
        m.Display();
    }
}
