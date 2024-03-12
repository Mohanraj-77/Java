interface Addition{
    int add(int a , int b) ;
    int mul(int a , int b) ;
    String st_name(String name) ;
}

public class interfacecls implements Addition
{
    public int add (int a , int b)
    {
        return a+b ;
    }
    public int mul (int a, int b)
    {
        return a*b ;
    }
    public String st_name (String name)
    {
        return name ;
    }

    
    public static void main(String args[])
    {
        interfacecls m = new interfacecls() ;
        System.out.println(m.add(10,20)) ;
        System.out.println(m.mul(2,5)) ;
        System.out.println(m.st_name("Java")) ;
    }
}
