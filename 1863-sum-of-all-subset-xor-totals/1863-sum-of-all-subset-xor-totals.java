class Solution {
    int total=0;
    public int subsetXORSum(int[] nums) {
        backtrack(nums,0,0);
        return total;
    }
    public void backtrack(int[]nums,int index,int currentxor)
    {
        if(index==nums.length){
            total+=currentxor;
            return;
    }
     backtrack(nums,index+1,currentxor^nums[index]);
     backtrack(nums,index+1,currentxor);
    }
}