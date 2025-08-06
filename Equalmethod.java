import java.util.Scanner;

class Employe{
     public String firstname;
    String lastname;
    int id;

    public Employe(   String firstname,String lastname,int id){
        this.firstname=firstname;
        this.lastname=lastname;
        this.id=id;

    }
    public boolean equals(Object std) {
        Employe stds;
        if(std instanceof Employe){
            stds=(Employe) std;
            return this.id==stds.id;
        }
        else {
            return false;

        }

    }
}

public class Equalmethod {
    public static void main (String args[]){
        Employe s1=new Employe("Hari","k",1);
        Employe s2=new Employe("Hari","g",3);
        Employe s3=new Employe("anu","k",3);
        System.out.println(s1.equals(s2));
        System.out.println(s2.equals((s3)));

    }
}
