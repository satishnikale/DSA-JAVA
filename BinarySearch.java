public class BinarySearch{

    public static int binarySearch(int arr[], int target){
        int low = 0, high = arr.length-1;

        while(low <= high){
            int mid = (low+high)/2;

            if(arr[mid] == target){
                return mid + 1;
            }

            if(arr[mid] < target){
                low = mid + 1;
            } else {
                high = mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {

        int arr[] = {2, 3, 5, 6, 7, 8};
        int target = 8;

        System.out.println(binarySearch(arr, target));
    }
}