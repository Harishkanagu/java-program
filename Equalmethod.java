import java.util.Scanner;

class Employe{
     public String firstname;
    String lastname;
    int pincode;

    public Employe(String firstname,String lastname,int pinnum){
        this.firstname=firstname;
        this.lastname=lastname;
        this.pincode=pincode;
    }
    public boolean equals(Object std) {
        Employe stds;
        if(std instanceof Employe){
            stds=(Employe) std;
            if((this.pincode == stds.pincode

            ) && (this.firstname == stds.firstname)){
                if(this.lastname== stds.lastname){
                    return true;
                }
            }
        }
        return false;
    }
}

public class Equalmethod {
    public static void main (String args[]){
        Employe s1=new Employe("Hari","k",1);
        Employe s2=new Employe("Hari","g",1);
        Employe s3=new Employe("Anu","g",3);
        Employe s4=new Employe("Anu","g",3);
        System.out.println(s1.equals(s2));
        System.out.println(s3.equals(s4));

    }
}
