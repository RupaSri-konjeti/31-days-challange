//buy one time and sell one time
import java.util.Scanner;
class Main{
    public static void main(String args[]){
        int prices[]={50,10,20,0,40,};
        int min = Integer.MAX_VALUE;
        int max = 0;
        for(int price:prices){
            if(price<min)
            {
                min=price;
            }
           
            int profit = price-min;
            
            if(profit>max)
             {
                 max=profit;
             }      
    }
    System.out.println(max);
}
}
