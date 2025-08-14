import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

class Hash_map{
    String name;
    int id;
    public Hash_map(String name,int id){
        this.name=name;
        this.id=id;
    }
}
public class Demo_Iteratormap {
    public static void main(String args[]){
        HashMap<String,ArrayList<Hash_map>> map1 =new HashMap<>();
        ArrayList<Hash_map> hashmap1=new ArrayList<>();
        hashmap1.add(new Hash_map("hari",12));
        ArrayList<Hash_map> hashmap2=new ArrayList<>();
        hashmap2.add(new Hash_map("Anu",13));
        map1.put("IT",hashmap1);
        map1.put("ECE",hashmap2);
        Iterator<ArrayList<Hash_map>> map =map1.values().iterator();
        while(map.hasNext()){
            ArrayList<Hash_map> en = map.next();
            System.out.println(en);
        }
    }
}
