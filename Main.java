package equalmethod;

public class Main {
    public static void main(String args[]){

        Voting v1=new Voting("Hari",19,"9065656020");
        Voting v2=new Voting("Anu",56,"9056785629");
        Voting v3=new Voting("Mythili",78,"9072867629");
        Voting v4=new Voting("Praveen",59,"9092933567");
        Voting v5=new Voting("Karthick",5,"8233242340");
        Voting v6=v5;
        Voting v7=v6;
        Voting v8=new Voting("Hari",19,"9065656020");
        System.out.println(v1.equals(v2)
                +"\n"+v2.equals(v3)+
                "\n"+v4.equals(v5)+
                "\n"+v6.equals(v5)+
                "\n"+v6.equals(v7)+
                "\n"+v8.equals(v1));
        System.out.println(v1.toString());
        System.out.println(v6.toString());
        System.out.println(v7.toString());
    }
}
