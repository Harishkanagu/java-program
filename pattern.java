import java.util.Scanner;
class Pattern {
    public static void main(String[] args) {
        System.out.print("Enter the size:");
        int n;
        Scanner scane = new Scanner(System.in);
        n = scane.nextInt();
        
        for (int i = 1; i <= n; i++) {//inner loop
            for (int j = 1; j <= i; j++) {//outer loop 
                System.out.print("*");
            }
            System.out.println();
        }
        
        scane.close();
    }
}
