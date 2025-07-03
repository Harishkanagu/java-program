public class Randomname {
    public static void main(String[] args) {
        int number = (int)(Math.random() * 5) + 1;
        if(number==1){
            System.out.println("Mythili");
        }
        else if (number==2) {
            System.out.println("Harish");
        }
        else if(number==3){
            System.out.println("Madhu");
        }
        else if( number==4){
            System.out.println("Hari");
        }
        else{
            System.out.println("Dharshini");
        }
    }    
}
