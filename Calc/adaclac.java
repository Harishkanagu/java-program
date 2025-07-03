package Calc;
public class adaclac{
    public int add( int a,int b)
    {
        return a + b;

    
    }
    public void sub(int a,int b)
    {
        int result=a-b;
        System.out.println("subtraction:"+result);
    

    }
    public void mul(int a,int b)
    {
        int result =a*b;
        System.out.println("Multipilcation:"+result);
    }
    public void div(int a,int b){
        int result;
        if(b==0){
            System.out.println("zero division error");
        }
        else{
            result=a/b;
            System.out.println("division"+result);
        }
       
        
    }


}
