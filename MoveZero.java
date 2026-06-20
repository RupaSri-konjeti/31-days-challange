//move zero to last 
import java.util.*;
class Main{
    public static void main(String args[])
    {
        int arr[]={10,0,90,21,2,0,23,9,34,0};
        
            int j =0;
            
                for (int i =0;i<arr.length;i++)
                {
                    if(arr[i]!=0)
                    {
                        int temp=arr[i];
                        arr[i]=arr[j];
                        arr[j]=temp;
                        
                        j++;
                    }
                  
            
                }
                 System.out.println(Arrays.toString(arr));
        
    }
}
