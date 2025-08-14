import java.util.ArrayList;
import java.util.Iterator;

class Array_list{
    String name;
    int id;
    public Array_list(String name,int id){
        this.name=name;
        this.id=id;
    }
    public String getname(){
        return name;
    }

    public int getid() {
        return id;
    }
}
public class Demo_Iterator{
    public static void main(String args[]){
        ArrayList<Array_list> array =new ArrayList<>();
        array.add(new Array_list("Hari",9));
        array.add(new Array_list("Anu",12));
        array.add(new Array_list("Indhu",13));

        Iterator<Array_list> myarray = array.iterator();
        while (myarray.hasNext()) {
            Array_list item = myarray.next();
            System.out.println("Name:"+item.getname()+"\tID:"+item.getid());
        }


    }
}
