class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] output=new int[nums.length];
        int left=0;
        int right=0;
        while(left<=nums.length-1){
            output[left]=nums[left]*nums[right];
            left++;
            right++;
        }
        left=0;
        if(nums[left]<0){
            Arrays.sort(output);
        }
        return output;
    }
}