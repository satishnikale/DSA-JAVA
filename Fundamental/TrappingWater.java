public class TrappingWater {
    public static void trappingRainWater(int height[], int n){
        // Declare two arrays to store leftmax and rightmax boundary.
        int leftMax[] = new int[n];
        int rightMax[] = new int[n];
        //check left max boundary from starting
        leftMax[0] = height[0];
        for(int i=1; i<n; i++){
            leftMax[i] = Math.max(height[i], leftMax[i-1]);
        }
        // check right max boundary from ending**
        rightMax[n-1] = height[n-1];
        for(int i = n-2; i>=0; i--){
            rightMax[i] = Math.max(height[i], rightMax[i+1]);
        }
        // calculate water level using min of both left and right boundries and subtract bar-height from it
        int trapedWater = 0;

        for(int i=0; i<n; i++){
            int waterLevel = Math.min(leftMax[i], rightMax[i]);
            trapedWater += waterLevel - height[i];
        }
        System.out.println(trapedWater);
    }
    public static void main(String[] args) {
        int height[] = {4, 2, 0, 6, 3, 2, 5};
        int n = height.length;

        trappingRainWater(height, n);
    }
}