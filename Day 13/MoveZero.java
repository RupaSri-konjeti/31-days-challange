//move zero 
import java.util.*;
class Main{
    public static void main(String args[])
    {
        int arr[]={0,20,30,0,4,0,4,3,2,0};
        int j=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]!=0)
            {
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                
                j++;
            }
        }
        System.out.println(Arrays.toString(arr));//it need to convert other wise gives the memory address
    }
}
