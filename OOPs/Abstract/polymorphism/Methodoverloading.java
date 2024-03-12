public class Methodoverloading
{                                     // compiler time polymorphism
 static int add(int a,int b)
{                                     // it is used to create methods with same name but different data types.
    return a+5-b ;
}

static float add(float a ,float b)
{
    return a+b ;
}

    public static void main(String args[])
    {
        System.out.println(add(5 ,5));
        System.out.println(add(5.5f, 5.5f)) ;
    }
}