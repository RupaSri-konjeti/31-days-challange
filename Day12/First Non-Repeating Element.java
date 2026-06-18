//First Non-Repeating Element
import java.util.*;
class Main{
    public static void main(String args[])
    {
        int arr[]={12,12,34,5,56,655,38,39};
        HashMap<Integer ,Integer>map = new HashMap<>();
        for(int num:arr)
        {
            map.put(num,map.getOrDefault(num,0)+1);
        }
        int ans=-1;
            for(int num:arr)
            {
                if(map.get(num)==1){
                ans=num;
                break;
            }
            }
        
        System.out.println(ans);
    }
}
