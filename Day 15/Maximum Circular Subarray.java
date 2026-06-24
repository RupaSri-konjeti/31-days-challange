//Maximum Circular Subarray Sum
import java.util.Scanner;
class Main{
    public static void main(String args[]){
        int arr[]={10,20,30,40,50,-1,4,-3};
        int total=0;
        int currentMax=0;
        int Max=arr[0];
    
        int currentMin=0;
        int Min=arr[0];
        
        for(int i=0;i<arr.length;i++)
        {
            total+=arr[i];
            
            currentMax=Math.max(arr[i],currentMax+arr[i]);
            Max=Math.max(currentMax,Max);
            
            currentMin=Math.min(arr[i],currentMin+arr[i]);
            Min=Math.min(currentMin,Min);
          
            
        }
         
       int circular=total-Min;
       int answer=Math.max(circular,Max);
       System.out.println(answer);
        
    }
    
}
