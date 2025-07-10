import java.util.Scanner;
class studentdetails 
{
    int regnum;
    String Name;
    long phone;
    Scanner scanner=new Scanner(System.in);
    System.out.print("Enter the Register number:");
    regnum=scanner.nextInt();
    System.out.print("Enter the Name:");
    Name=scanner.nextString();
    System.out.print("Enter the Phone number:");
    phone=scanner.nextLong();
    scanner.close();
    
    public void display()
    {
        System.out.print("Student details");
        System.out.print("Register num:"+regnum);
        System.out.print("Student Name:"+ Name)
        System.out.print("Phone number:"+phone);
    }
}
public class main 
{
    public static void main(String[] args)
    {
        studentdetails s=new studentdetails();
        s.display();
    }
}
