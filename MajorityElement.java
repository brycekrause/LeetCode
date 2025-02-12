class Solution {
    public int majorityElement(int[] nums) {
        int[] nums = {3,2,3,1,1,4,3,3,3};
		int count = 0;
		for (int element : nums) {
			for (int i = 0; i < nums.length; i++) {
				if (nums[i] == element) {
					count++;
				}
			}
			if (count > nums.length / 2) {
				return(element);
			}else {
				count = 0;
			}
		}
    }
}