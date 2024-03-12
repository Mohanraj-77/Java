class Animal
{
    void sound ()
    { 
        System.out.println("Generic Sounds") ;           //Hirarchical inheritance which contains one parent class and multipe child class 
    }                                                    // that extends parent class
}

class dog extends Animal
{
    void sound ()
    {
        System.out.println("Bark") ;
    }
}
class cat extends Animal
{
    void sound ()
    {
        System.out.println("MEow") ;
    }
}

class goat 
{
    void sound ()
    {
        System.out.println("maa") ;
    }
}


public class hierarchical
{
     public static void main(String args[])
     {
            dog d = new dog() ;
            d.sound() ;

            goat g = new goat() ;
            g.sound() ;
            
     }
}