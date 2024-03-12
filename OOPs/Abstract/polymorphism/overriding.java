class Animal
{
 void sounds()                               // Methodoverriding is used to provide specific implementation of method that is already defined in general class 
{
  System.out.println("Generic Sounds");
}
}

class cat extends Animal                // it can be achieved by using the same method name 
{
void sounds()
{
System.out.println("Meow");
}
}

public class overriding
{
public static void main(String args[])
{
    cat c = new cat();                     
      c.sounds();
}

}
