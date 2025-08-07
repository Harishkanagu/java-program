import java.util.*;
class Workerdetails{
    String address;
    int salary;
    int emply_id;

    public Workerdetails(String address,int salary,int emply_id){
        this.address=address;
        this.salary=salary;
        this.emply_id=emply_id;;

    }
    public int getSalary(){
        return salary;
    }
    public String getAddress(){
        return address;
    }

    public int getEmplyid(){
        return emply_id;
    }

}
public class Map_class {
    public static void main(String args[]) {
        Map<String,ArrayList<Workerdetails>> map = new HashMap<>();

        Workerdetails wdname1=new Workerdetails("Coimbatore",90000,19);
        Workerdetails wdname2=new Workerdetails("Tiruppur",80000,13);
        Workerdetails wdname3=new Workerdetails("Erode",70000,12);
        ArrayList<Workerdetails> dtsworker_1=new ArrayList<>();
        dtsworker_1.add(wdname1);
        ArrayList<Workerdetails> dtsworker_2=new ArrayList<>();
        dtsworker_2.add(wdname2);
        ArrayList<Workerdetails> dtsworker_3=new ArrayList<>();
        dtsworker_3.add(wdname3);
        map.put("Hari",dtsworker_1);
        map.put("Mythili",dtsworker_2);
        map.put("Praveen",dtsworker_3);
        ArrayList<Workerdetails> list =map.get("Hari");
         for(Workerdetails workers:list){
             System.out.println("IDnum:"+workers.getEmplyid());
             System.out.println("Address:"+workers.getAddress());
             System.out.println("Salary:"+workers.getSalary());
         }

    }

}
