////Maximum Subarray using Kadane's Algorithm (O(n))
class Main {
    public static void main(String args[]) {

        int arr[] = {10, 20, 30, 40, 50};

        int currentMax = 0;
        int max = arr[0];

        for (int num : arr) {
            currentMax += num;
            max = Math.max(max, currentMax);

            if (currentMax < 0)
                currentMax = 0;
        }

        System.out.println(max);
    }
}
