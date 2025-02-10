class Solution {
    public boolean containsNearbyAlmostDuplicate(int[] nums, int indexDiff, int valueDiff) {
		int[] nums = {1,5,9,1,5,9};
		int indexDiff = 2;
		int valueDiff = 3;
		int flag = 0;
		
		for (int i = 0; i < nums.length; i++) {
			for (int j = i+1; j < nums.length; j++) {
				if ((i != j) && (Math.abs(i - j) <= indexDiff) && (Math.abs(nums[i] - nums[j]) <= valueDiff)) {
					flag = 1;
				}
			}
		}
		if (flag == 1) {
			return true;
		}else {
			return false;
		}
    }
}