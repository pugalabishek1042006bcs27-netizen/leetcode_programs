class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] output=new int[nums.length];
        int[] lp=new int[nums.length];
        int[] rp=new int[nums.length];
        java.util.Arrays.fill(output,1);
        java.util.Arrays.fill(lp,1);
        java.util.Arrays.fill(rp,1);
        int left=0;
        int right=nums.length-1;
        int leftprod=1;
        int rightprod=1;

        while(left<nums.length){

            lp[left]*=leftprod;
            leftprod*=nums[left];
            left++;
            rp[right]*=rightprod;
            rightprod*=nums[right];
            right--;
            
           

        }
       
        for(int i=0;i<nums.length;i++){
            output[i]=lp[i]*rp[i];
        }
        return output;
    }
}