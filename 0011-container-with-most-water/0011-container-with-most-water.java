class Solution {
    public int maxArea(int[] height) {
         
	    int left=0;
	    int right=height.length-1;
	    int h=0,area=0,maxarea=0,width=0;
	    while(left<right){
	        h=Math.min(height[left],height[right]);
	        width=right-left;
	        area=h*width;
	        maxarea=Math.max(maxarea,area);
	        
	        if(height[left]<height[right]){
	            left++;
	        }
	        else{
	            right--;
	        }
	    }
        return maxarea;
    }
}