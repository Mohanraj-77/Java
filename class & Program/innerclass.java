class outer
{
    int x;
    void outer()
    {
        System.out.println("World");
    }
    class inner 
    {   
        int num;
        void inner()
        {
        System.out.println("HELLO"); }
    }
}




public class innerclass
{
    public static void main (String args[])
    {
        outer n1 = new outer();
        n1.x=10 ;
        System.out.println(n1.x);
        n1.outer() ;
        outer.inner n2 = n1.new inner();
        n2.inner() ;
        n2.num = 20 ;
        System.out.println(n2.num);


    }
}