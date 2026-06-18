//Highest Frequency Element
import java.util.*;
class Main{
    public static void main(String args[])
    {
        int arr[]={12,45,65,34,23,12};
        int max=0;
        int ans=-1;
        HashMap<Integer,Integer>map =new HashMap<>();
        for(int num:arr)
        {
            map.put(num,map.getOrDefault(num,0)+1);
        
        {     
           for(int key : map.keySet())
           {
           /*map.keySet() gives all the elements present in the HashMap.
             int key stores one key at a time.*/
                                               
       if(map.get(key)>max)
       {
           max=map.get(key);
           ans=key;
       }
       
    }
    
        }
        }
        System.out.println("key : "+ans);
       System.out.println("Frquency : "+max);
    }
}
