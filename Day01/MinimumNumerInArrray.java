import java.util.Scanner;
class MinimumNumerInArrray
{
    public static void main(String args[])
    {
        int arr[]={13,76,9,67,54};
        int min = arr[0];
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i] < min)
            {
                min=arr[i];
            }
        }
        System.out.println(min);
    }
}
