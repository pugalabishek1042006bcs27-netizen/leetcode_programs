import java.util.HashMap;
class Solution {
    public int[] twoSum(int[] nums, int target) {
    HashMap<Integer,Integer> a=new HashMap<>();
    for(int i=0;i<nums.length;i++){
        int needed=target-nums[i];
        if(a.containsKey(needed))
            return new int[]{a.get(needed),i};
        a.put(nums[i],i);
    }
    return new int[]{};
    }
}