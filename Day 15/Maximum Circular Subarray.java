// Maximum Circular Subarray Sum - Optimal Solution (O(n))
import java.util.Scanner;

class Main {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of elements:");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int total = 0;

        int currentMax = 0;
        int maxSum = arr[0];

        int currentMin = 0;
        int minSum = arr[0];

        for (int i = 0; i < n; i++) {

            total += arr[i];

            // Maximum Subarray (Kadane)
            currentMax = Math.max(arr[i], currentMax + arr[i]);
            maxSum = Math.max(maxSum, currentMax);

            // Minimum Subarray (Reverse Kadane)
            currentMin = Math.min(arr[i], currentMin + arr[i]);
            minSum = Math.min(minSum, currentMin);
        }

        int answer;

        // Handle all negative elements
        if (maxSum < 0) {
            answer = maxSum;
        } else {
            int circularSum = total - minSum;
            answer = Math.max(maxSum, circularSum);
        }

        System.out.println("Maximum Subarray Sum = " + maxSum);
        System.out.println("Minimum Subarray Sum = " + minSum);
        System.out.println("Maximum Circular Subarray Sum = " + answer);
    }
}





/*
//Maximum Circular Subarray Sum
import java.util.Scanner;
class Main{
    public static void main(String args[]){
        Scanner sc =new Scanner (System.in);
       System.out.println("neku kavasinavi nokuko");
       int n = sc.nextInt();
       int arr[]=new int[n];
       for(int i=0;i<n;i++)
       {
           arr[i]=sc.nextInt();
       }
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
*/
