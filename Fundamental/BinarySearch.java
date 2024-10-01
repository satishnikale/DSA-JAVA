public class BinarySearch{

    public static int binarySearch(int arr[], int target){
        // Initialise starting and ending index for traversing.
        int low = 0, high = arr.length-1;
        // low <= high if remain single element.
        while(low <= high){
            int mid = (low+high)/2;
        // return index + 1 if found.
            if(arr[mid] == target){
                return mid + 1;
            }
        // if arr[mid] < target then go for second half (low = mid +1) 
        // else search in first half (high = mid - 1)
            if(arr[mid] < target){
                low = mid + 1;
            } else {
                high = mid-1;
            }
        }
        // if not found return -1
        return -1;
    }
    public static void main(String[] args) {

        int arr[] = {2, 3, 5, 6, 7, 8};
        int target = 8;

        System.out.println(binarySearch(arr, target));

        // Time complexity : O(N)
        // Space complexity : O(1)
    }
}