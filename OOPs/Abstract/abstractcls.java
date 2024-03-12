abstract class Addition{
    abstract int add(int a , int b);         // abstract is used to hide data
    // public int add(int a , int b)
    // {
    //     return a+b ;
    // }
     public int subtract(int a ,int b)
    {
        return a-b ;
    }

    public String name (String name)
    {
        return name ;
    }
}

public class abstractcls extends Addition
{
    public int add (int a ,int b)
    {
        return a+b;
    }
    public static void main(String args[])
    {
        abstractcls m = new abstractcls() ;
        System.out.println(m.add(10,20)) ;
        System.out.println(m.subtract(50,30)) ;
        System.out . println(m.name("HEllo")) ;
    }
}