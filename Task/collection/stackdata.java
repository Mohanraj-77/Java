class Stack{
int arr[] = new int [3];
int tos = -1 ;

void push(int item)
{
    if(tos==arr.length-1)
    {
        System.out.println("Stack is Full") ;
    }
    else
     arr[++tos] = item ;
}

int pop()
{
    if(tos==0)
    {
        System.out.println("Stack is empty");
    }
    return arr[tos--] ;
}
}



public class stackdata
{
    public static void main(String args[])
    {
        Stack s = new Stack();
        s.push(2);
        s.push(4);
        //System.out.println(s);
        System.out.println(s.pop()) ;
    }
}

