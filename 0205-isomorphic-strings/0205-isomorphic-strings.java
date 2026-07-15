class Solution {
    public boolean isIsomorphic(String s, String t) {
        char[] ch=s.toCharArray();
	    char[] ch1=t.toCharArray();
	    
        HashMap<Character,Character>map=new HashMap<>();
        HashMap<Character,Character>map1=new HashMap<>();
       
        boolean flag=false;
        for(int i=0;i<ch.length;i++){
            if(map.containsKey(ch[i])){
                if(map.get(ch[i])==ch1[i]){
                    flag=true;
                    continue;
                }
                else{
                    flag=false;
                    break;
                }

            }
            else{
                if(map1.containsKey(ch1[i])){
                    flag=false;
                    break;

                }
                else{
                    map.put(ch[i],ch1[i]);
                    map1.put(ch1[i],ch[i]);
                    flag=true;
                }
            }
        }
        return flag;
    }
}
