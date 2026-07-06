class Solution {
    public int majorityElement(int[] nums) {
        boolean flag=false;
	     HashMap<Integer,Integer>map=new HashMap<>();
	     for(int i=0;i<nums.length;i++){
	         if(map.containsKey(nums[i])){
	             map.put(nums[i],map.get(nums[i])+1);
	         }
	         else{
	             map.put(nums[i],1);
	         }
	     }
	     int b=-1;
         double z=nums.length;
	     double a=z/2;
	     for(int i=0;i<nums.length;i++){
	         if(map.get(nums[i])>a){
	             b=nums[i];
	             flag=true;
	         }
	     }
	     if(flag){
	         return b;
	     }
	     else{
	         return -1;
	     }
    }
}