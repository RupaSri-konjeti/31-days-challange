//to find the maximum number in the Array
//first number ni means arr[0] is maximum anukuntam
//danito every next next number ni check chestam
//if big number ayitey update chestam lekapotey previous number tho follow ayipotam

import java.util.Scanner;
class Main
{
    public static void main(String args[]) 
    {
    int arr[]={10,307,100,67,807};
    
    int max=arr[0];
    
        for(int i=1;i<arr.length;i++)  //"arr means variablle" //arr.length will calculate noof elements in the array
        {
            if(arr[i] > max)             //if condition dont have the ";"
        {
            max=arr[i];
        }
        }
        System.out.println(max);
    }
}
