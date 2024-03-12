class Car {
    int wheels;
    int door ;                // Single inheritance - we can access the parent class elements in the child class.

    int mirror ;
    int headlamp;

}

class BMW extends Car
{
    int seats;
    int airbag ;
}





public class inheritance
{

    public static void main(String args[])
    {
            BMW b = new BMW() ;
            b.seats = 5 ;
            b.airbag = 2 ;
            b.wheels = 4 ;
            b.door  = 4 ;
            b.mirror = 2 ;

            System.out.println("Wheels :   " + b.wheels) ;
            System.out.println("doors :    " +  b.door) ;
            System.out.println("Airbag :   " + b.airbag) ;
            System.out.println("Seats:     " + b.seats) ;
            System.out.println("Mirrors :  " + b.mirror) ;

           
    }
}