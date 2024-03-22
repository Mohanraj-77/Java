import java.util.*;

public class stack1
{
    public static void main(String args[])
    {
        Stack <Integer> st = new Stack <> ();
        st.add(1);
        st.push(2);
        st.push(3);

        System.out.println(st);
        //st.pop(1);
        System.out.println(st.pop());      // removes last element
        System.out.println(st.peek());     // it does not remove element it show which element is going to remove next
        System.out.println(st);

        Queue <Integer> qu = new PriorityQueue <> () ;        // it is based on natural ascen order
        qu.add(5);  
        qu.add(8);
        qu.add(7);
        qu.offer(6);
        //qu.offerFirst(10) ;
        System.out.println(qu);
        qu.poll();                       // removes first element
        System.out.println(qu);
        System.out.println(qu.peek()) ;  // return first element
        


        Deque <String> q1 = new ArrayDeque<> ();
        q1.offer("M");
        q1.offer("O");     // adds element
        q1.offer("H");
        q1.offerFirst("R");  // adds element at first
        q1.offerLast("A");   // adds element at last

        System.out.println(q1);
        System.out.println(q1.poll()); // removes first element
        System.out.println(q1.peek()); // show which element remove next but not remove
        System.out.println(q1.pollLast());   // removes element from last
        System.out.println(q1.peekLast());  // show which element remove last but not remove


       
    }
}