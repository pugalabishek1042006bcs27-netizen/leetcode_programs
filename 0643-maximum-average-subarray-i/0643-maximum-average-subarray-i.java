class Solution {
    public double findMaxAverage(int[] nums, int k) {
       int left=0;
	     int right=0;
	     int sum=0,window=0;
	     double avg=0.0000;
	     double maxavg=-Double.MAX_VALUE;
	     while(right<=nums.length-1){
	         window=right-left+1;
	         if(window==k){
	             sum+=nums[right];
	             avg=(double)sum/k;
	             maxavg=Math.max(maxavg,avg);
	             sum-=nums[left];
	             left++;
	             right++;
	         }
	         else{
	             sum+=nums[right];
	             right++;
	         }
	     }
	     return maxavg;
	    
    }
}