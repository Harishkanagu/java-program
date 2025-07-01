public class classandobject {
    
    int regnum;
    String name;
    
    public void set(int regnum,String name)
    {
        this.regnum=regnum;
        this.name=name;
    }
    public void get()
    {
        System.out.println("reg num:"+regnum);
        System.out.println("Name of Std:"+name);
    }

    public static void main(String agrs[]){
        classandobject s=new classandobject();
        
        s.set(7128,"HARISH");
        s.get();
        
    }
}
    
