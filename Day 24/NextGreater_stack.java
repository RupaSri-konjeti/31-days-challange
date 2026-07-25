//Next greater element 
import java.util.Stack;
class Greater{
    public static void greater(int[] arr){
        Stack<Integer> stack = new Stack<>();
        int ans[]= new int [arr.length];
        for(int i=arr.length-1;i>=0;i--){
            while(!stack.isEmpty()&&stack.peek()<=arr[i]){
                stack.pop();
            }
            if(stack.isEmpty()){
                ans[i]=-1;
            }
                else{
                    ans[i]=stack.peek();
                }
                stack.push(arr[i]);
            }
            System.out.println("Next element");
            for(int i=0;i<ans.length;i++){
                 System.out.print(ans[i] +" ");
            }
        }
}


        class Main{
        public  static void main(String args[]){
            int arr[]={10,90,40,56};
           Greater.greater(arr);
        }
        }
////Next greater element 
import java.util.Stack;
class Greater{
    public static void greater(int[] arr){
        Stack<Integer> stack = new Stack<>();
        int ans[]= new int [arr.length];
        for(int i=arr.length-1;i>=0;i--){
            while(!stack.isEmpty()&&stack.peek()<=arr[i]){
                stack.pop();
            }
            if(stack.isEmpty()){
                ans[i]=-1;
            }
                else{
                    ans[i]=stack.peek();
                }
                stack.push(arr[i]);
            }
            System.out.println("Next element");
            for(int i=0;i<ans.length;i++){
                 System.out.print(ans[i] +" ");
            }
        }
}


        class Main{
        public  static void main(String args[]){
            int arr[]={10,90,40,56};
           Greater.greater(arr);
        }
        }
// o/p-90 -1 56 -1
