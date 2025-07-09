package Arraylist;//package
import java.util.ArrayList;
public class startwithA 
{//class name

    public void display(){
        ArrayList<String> list_name=new ArrayList<>();
        list_name.add("Hari");
        list_name.add("Anu");
        list_name.add("Karthick");
        list_name.add("Abi");
        for (String name:list_name){
            if(name.startsWith("A"))
            {
                System.out.println("starting letter:"+name);
            }

        }
    }
        
}

