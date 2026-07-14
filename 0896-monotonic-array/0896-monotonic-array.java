class Solution {
    public boolean isMonotonic(int[] nums) {
        
        
        boolean increase=false;;
        boolean decrease=false;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]!=nums[i+1]){
                 if(nums[i]<nums[i+1]){
                    increase=true;
                    break;
                 }
                 else{
                    decrease=true;
                    break;
                 }
            }
        }
        if(!increase&&!decrease){
            return true;
        }
        for(int i=0;i<nums.length-1;i++){
            if(increase){
                if((nums[i]<=nums[i+1])==increase){
                    increase=true;
                }
                else{
                    return false;
                }
            }
            else{
                if((nums[i]>=nums[i+1])==decrease){
                    decrease=true;
                }
                else{
                    return false;
                }
            }
        }
        if(increase){
            return increase;
        }
        else{
            return decrease;
        }

    }
}