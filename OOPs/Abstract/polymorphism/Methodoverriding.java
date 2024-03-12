
class A{
    void printhello()
    {
        System.out.println("Hello");
    }
}

class B extends A 
{
    void printhello()
    {
        System.out.println("Test");
    }
}

public class Methodoverriding
{

    public static void main(String args[])
    { 
    
        B user = new B() ;
        user.printhello() ;

    //   A user = new A();
    //   user.printhello() ;
      
    //   B user1 = new B();
    //   user1.printhello() ;
      }
}