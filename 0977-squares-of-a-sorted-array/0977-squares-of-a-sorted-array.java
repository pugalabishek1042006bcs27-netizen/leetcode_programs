class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] output=new int[nums.length];
        int left=0;
        int right=nums.length-1;
        int index=nums.length-1;
        int a=0,b=0;
        while(left<=right){
            a=nums[left]*nums[left];
            b=nums[right]*nums[right];
            if(a<b){
                output[index--]=b;
                right--;
          
            }
            else{
                output[index--]=a;
                left++;
            }
  
        }
     
         
        
        return output;
    }
}