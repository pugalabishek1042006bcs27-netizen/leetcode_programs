class Solution {
    public void moveZeroes(int[] nums) {
         int r=0;
	     int w=0;
	     while(r<=nums.length-1){
	         if(nums[r]!=0){
	             nums[w]=nums[r];
	             r++;
	             w++;
	         }
	         else{
	             r++;
	         }
	     }
	     for(int i=w;i<=r-1;i++){
	         nums[i]=0;
	     }
	     System.out.print("moved zeroes ");
    }
}