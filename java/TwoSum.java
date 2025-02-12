class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] nums = {1,2,3,4,5,6};
        int target = 7;

        for (int i = 0; i < nums.length; i++){
            for (int j = i; j < nums.length; j++){
                if (nums[i] + nums[j] == target){
                    System.out.printf("[%d,%d]\n", i, j);
                }
            }
        }
    }
}