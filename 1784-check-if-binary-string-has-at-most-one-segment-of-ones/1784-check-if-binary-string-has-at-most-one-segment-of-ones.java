class Solution {
    public boolean checkOnesSegment(String s) {
        boolean zero=false;
        for(int i=0;i<s.length();i++){
            

            if(s.charAt(i)=='0'){
                zero=true;
            }
            if(s.charAt(i)=='1'&& zero)
            {
                return false;
            }
        }
        return true;
    }
}
