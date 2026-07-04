class Solution {
    public int[] sortedSquares(int[] nums) {
         int left=0;
	    int right=1;
	    while(left<=nums.length-1){
	        nums[left]=nums[left]*nums[left];
	        left+=2;
	    }
	    while(right<=nums.length-1){
	        nums[right]=nums[right]*nums[right];
	        right+=2;
	    }
	    Arrays.sort(nums);
	    return nums;
    }
}