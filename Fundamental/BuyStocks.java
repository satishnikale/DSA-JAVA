public class BuyStocks {
    public static void sellStocks(int arr[], int n){
        int maxProfit = Integer.MIN_VALUE;
        int currentProfit = 0;

        for(int i=0; i<n; i++){
            int buy = arr[i];
            for(int j=i+1; j<n; j++){
                currentProfit = arr[j] - buy;
                maxProfit = Math.max(currentProfit, maxProfit);
            }
        }
        System.out.println(maxProfit);
    }

    public static void sellStocksOptimised(int arr[], int n){
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for(int i=0; i<n; i++){
            // profit = sellingPrice - buyPrice
            if(buyPrice < arr[i]){
                int profit = arr[i] - buyPrice;
                maxProfit = Math.max(profit, maxProfit);
            } else {
                buyPrice = arr[i];
            }
        }        
        System.out.println(maxProfit);        
    }
    public static void main(String[] args) {
        int arr[] = {7, 1, 5, 3, 6, 4};
        int n = arr.length;

        sellStocks(arr, n);
        sellStocksOptimised(arr, n);        
    }
}