class Solution {
    public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
        

        int left=0;
        int a=0;
        for(int i=0;i<grumpy.length;i++){
            if(grumpy[i]==0){
                a+=customers[i];
            }
        }
        int sum=0,maxsum=0;
        for(int i=0;i<minutes;i++){
            if(grumpy[i]==1){
                sum+=customers[i];
            }
        }
        maxsum=sum;
        for(int right=minutes;right<grumpy.length;right++){
                if(grumpy[right]==1){
                    sum+=customers[right];
                }
                if(grumpy[left]==1){
                    sum-=customers[left];
                    
                }
                maxsum=Math.max(maxsum,sum);
                left++;
        }
        return a+maxsum;
    }
}