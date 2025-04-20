import java.util.HashMap;
import java.util.Map;

class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        // Brute force approach to find two indices such that their values sum up to the target
        // Time complexity: O(n^2), where n is the length of the nums array
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{}; // Return an empty array if no solution is found
    }

    public int[] twoSumOptimized(int[] nums, int target) {
        // Optimized approach using a HashMap to store the indices of the numbers
        // Time complexity: O(n), where n is the length of the nums array
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }
            map.put(nums[i], i);
        }
        return new int[]{}; // Return an empty array if no solution is found
    }

    public int[] twoSumOptimizedwithforloop(int[] nums, int target) {
        // Optimized approach using a for loop to find two indices such that their values sum up to the target
        // Time complexity: O(n), where n is the length of the nums array
        // This is a brute force approach but with a different structure
        int[] result = new int[2];
        for(int i=1;i<nums.length;i++){
            for(int j=i;j<nums.length;j++){
                if(nums[j]+nums[j-i]==target){
                    result[0]=j-i;
                    result[1]=j;
                    return result;
                }
            }
        }
        return new int[]{}; // Placeholder for future implementation using streams
    }
    public static void main(String[] args) {
        TwoSum solution = new TwoSum();
        TwoSum solutionOptimized = new TwoSum();
        TwoSum solutionOptimizedwithforloop = new TwoSum();
        int[] nums = {2, 8, 7, 15};
        int target = 9;
        int[] resultOptimizedwithforloop = solutionOptimizedwithforloop.twoSumOptimizedwithforloop(nums, target);
        int[] resultOptimized = solutionOptimized.twoSumOptimized(nums, target);
        int[] result = solution.twoSum(nums, target);
        System.out.println("optimized with for loop results: " + resultOptimizedwithforloop[0] + ", " + resultOptimizedwithforloop[1]);
        System.out.println("optimized results: " + resultOptimized[0] + ", " + resultOptimized[1]);
        System.out.println("Brute force result: " + result[0] + ", " + result[1]);
    }
}