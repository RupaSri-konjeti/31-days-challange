//duplicate remove for sorted order
import java.util.*;
class Main{
    public static void main(String args[])
    {
        int arr[]={10,10,20,20,30,30,40,50};
        int j=1;
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]!=arr[j-1])
            {
                arr[j]=arr[i];
                j++;
            }
        }
        for(int i=0;i<j;i++){
        System.out.print(arr[i] + " ");
    }
}
}
