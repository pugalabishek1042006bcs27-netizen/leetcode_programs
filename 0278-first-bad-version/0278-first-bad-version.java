/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        

        int left=1;
        int right=n;
        boolean a=false;
        boolean flag=false;
        int b=0;
        while(left<=right){

            int mid=left+(right-left)/2;
            a=isBadVersion(mid);
            if(a){
                b=mid;
                right=mid-1;
                flag=true;
            }
            else{
                left=mid+1;
               
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