class Solution {
    public void moveZeroes(int[] nums) {
		int[] nums = {0,1,2,0,5, 8, 9, 0, 6};
		int nonZeroIndex = 0;
		
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] != 0) {
				nums[nonZeroIndex++] = nums[i];
			}
		}
		
		for (int i = nonZeroIndex; i < nums.length; i++) {
			nums[i] = 0;
		}
		
		for (int i = 0; i < nums.length; i++) {
			System.out.printf("%d ", nums[i]);
		}
    }
}