//Find the sum of all elements in an array
import java.util.Scanner;
class Sum_Of_Elements{
public static void main (String args[])
{
    int arr[]={1,2,2,5,10};
    int sum=0;  //should be out of the loop so that the sum doeest change
    for(int i=0;i<arr.length;i++)
    {
        sum=sum+arr[i];
    }
    System.out.println(sum);
}
}
