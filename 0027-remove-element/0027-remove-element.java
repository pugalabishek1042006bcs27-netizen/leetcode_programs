class Solution {
    public int removeElement(int[] nums, int val) {
        ArrayList<Integer> a=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            a.add(nums[i]);
        }
        a.removeIf(n->n==val);
        for(int i=0;i<a.size();i++){
            nums[i]=a.get(i);
        }
        return a.size();

    }
}