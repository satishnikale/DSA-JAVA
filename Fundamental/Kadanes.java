public class Kadanes {
    public static int kadanesAlgo(int arr[], int n){
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;
        // if any value goes less than zero then make it zero yourself
        for(int i=0; i<n; i++){ 
            currSum = currSum + arr[i];
            if(currSum < 0){
                currSum = 0;
            }
        // compare currSum and maxSum ans store max value in maxSum variable and return it.
        maxSum = Math.max(currSum, maxSum);
        }
        return maxSum;
    }
    public static int kadanesForAllNegatives(int arr[], int n){
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;

        for(int i=0; i<n; i++){
            // compare currSum+arr[i] to the arr[i], store larger of them in currSum
            currSum = Math.max(currSum+arr[i], arr[i]);
            // compare maxSum and currSum & store max of them in maxSum variable & return it.
            maxSum = Math.max(maxSum, currSum);

        }
        return maxSum;
    }
    public static void main(String[] args) {
        int arr[] = {-2, -3, 4, -1, -2, 1, 5, -3};
        int n = arr.length;

        int maxSum = kadanesForAllNegatives(arr, n);
        System.out.println(maxSum);
    }
}
