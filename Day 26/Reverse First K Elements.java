//Reverse the First K Elements of a Queue
import java.util.*;
class Main{
    public static void main (String args[])
    {
        Queue<Integer> q = new LinkedList<>();
        Stack<Integer> s = new Stack<>();
        
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);
        
        int k=3;
        
        //remove from queue and add to Stack
        for(int i=0;i<k;i++){
            s.add(q.remove());
        }
        //stack lo nunchi pop chesi queue lo add cheyali
        while(!s.isEmpty()){
            q.add(s.pop());
        }
        // front unna numbers back ki pampali 
        int size = q.size();
        for(int i=0;i<size-k;i++){
            q.add(q.remove());
        }
        System.out.println(q);
    }
}

//o/p - 30 20 10 40 50
