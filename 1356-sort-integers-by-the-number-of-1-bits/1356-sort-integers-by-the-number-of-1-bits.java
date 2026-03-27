import java.util.*;
class Solution {
    public int[] sortByBits(int[] arr)
    {
        Integer[] num =new Integer[arr.length];
        for(int i=0;i<arr.length;i++){
            num[i]=arr[i];
        } 
        Arrays.sort(num,(a,b)->{
            int counta=Integer.bitCount(a);
            int countb=Integer.bitCount(b);
            if(counta==countb){
                return a-b;
            }
            else{
                return counta-countb;
            }
        });
            for(int i=0;i<arr.length;i++){
                     arr[i]=num[i];
            }
            return arr;
    }

}
