class Solution {
    public String[] findWords(String[] words) {

        HashMap<Character,Integer>map=new HashMap<>();
     
        String s="qwertyuiopQWERTYUIOP";
        String s1="asdfghjklASDFGHJKL";
        String s2="zxcvbnmZXCVBNM";
        List<String>result=new ArrayList<>();
        for(int i=0;i<s.length();i++){
            map.put(s.charAt(i),1);
        }
        for(int i=0;i<s1.length();i++){
            map.put(s1.charAt(i),2);
        }
        for(int i=0;i<s2.length();i++){
            map.put(s2.charAt(i),3);
        }
        
        for(String a:words){
            boolean flag=true;
            int row=map.get(a.charAt(0));
            for(int i=1;i<a.length();i++){
                if(map.get(a.charAt(i))!=row){
                    flag=false;
                    break;
                }
                else{
                    continue;
                }
            }
            if(flag){
                result.add(a);
            }
        }
        return result.toArray(new String[0]);
       


    }
}