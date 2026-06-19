//Two Sum using HashMap
import java.util.*;
class Main{
    public static void main(String args[])
    {
        int arr[]={10,20,30,40,50};
        int target=90;
        HashMap<Integer , Integer>map = new HashMap<>();
        {
            for(int i = 0;i<arr.length;i++)
            {
               int complement = target - arr[i];
            {
            if (map.containsKey(complement))
            {
                System.out.println(map.get(complement)+ " " + i);//adding two
                break;
            }
            map.put(arr[i],i);
            
        }
    }
}
}
}
