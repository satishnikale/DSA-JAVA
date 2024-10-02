public class PrefixSum {
    public static int prefixSum(int arr[], int n){
        // Initialise an prefis array to store the sum
        int prefix[] = new int[n];
        prefix[0] = arr[0];
        // Store sum of elm till indexes
        for(int i=1; i<n; i++){
            prefix[i] = prefix[i-1] + arr[i];
        }
        // Initialise max variable to store the and compare max sum with current sum.
        int maxSum = Integer.MIN_VALUE;
        for(int i=0; i<n; i++){
            int start = i;
            for(int j=i; j<n; j++){
                int end = j;
            // if start is 0 then max sum is prefix[start] 
            // otherwise subtract prefix[end] - prefix[start-1]
            int currSum = start == 0 ? prefix[end] : prefix[end] - prefix[start-1];
            if(maxSum < currSum){
                maxSum = currSum;
            }
            }
        }
        return maxSum;
    }
    public static void main(String[] args) {
        int arr[] = {4, 5, 8, 7, 3, 2, 1, 9};
        int n = arr.length;
        int maxSum = prefixSum(arr, n);
        System.out.println(maxSum);

        // Time : O(N^2)
        // Space : O(N)
        
    }
}
