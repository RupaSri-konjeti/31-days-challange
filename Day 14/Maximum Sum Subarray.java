//Maximum Sum Subarray of Size K
//Maximum sub array means in the given array .we divide it into k sub arrays. We have to find which sub array is having the highest sum and need to print.
import java.util.Scanner;
  class Main{
    public static void main (String args[])
    {
        int arr[]={10,20,30,40,50,60};
        int k=3;
        int sum=0;
        
        for(int i=0;i<k;i++)
        
            sum+=arr[i];
        
        int maxSum = sum;
        
        for(int i = k ;i < arr.length;i++)//METHOD: for integer a.length , for strings a.length()
        {
            sum=sum-arr[i-k]+arr[i];
            maxSum = Math.max(maxSum,sum);//maxSum=Previous large sum, sum=current sum
        }
        
        System.out.println(maxSum);
    
    }
}
