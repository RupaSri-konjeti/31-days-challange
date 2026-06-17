//Sum of all elements
import java.util.Scanner;
class Main{
    public static void main(String args[]){
       Scanner sc =new Scanner(System.in);
       int arr[][]=new int[1][3];
       int sum=0;
       for(int i=0;i<arr.length;i++)
       {
           for(int j=0;j<arr[i].length;j++)
       {
          arr[i][j]=sc.nextInt();
       }
    }
       for(int i=0;i<arr.length;i++)
       {
           for(int j=0;j<arr[i].length;j++)
       {
           sum=sum+arr[i][j];
       }
    }
     System.out.println(sum);
}
}
