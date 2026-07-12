class Solution {
    public int longestPalindrome(String s) {
      char[] ch=s.toCharArray();
      HashMap<Character,Integer>map=new HashMap<>();
      for(int i=0;i<ch.length;i++){
        if(map.containsKey(ch[i])){
            map.put(ch[i],map.get(ch[i])+1);
        }
        else{
            map.put(ch[i],1);
        }
      }
      System.out.println(map);
      int length=0;
      for(char key:map.keySet()){
        if(map.get(key)%2==0){
            length+=map.get(key);
        }
        else if(map.get(key)%2!=0 &&map.get(key)==1){
            length+=0;
        }
        else{
            length+=map.get(key)-1;
        }
      }
      for(char key:map.keySet()){
        if(map.get(key)%2!=0){
            length+=1;
            break;
        }
      }
      
      return length;


    }
}