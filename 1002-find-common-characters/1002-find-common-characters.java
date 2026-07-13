class Solution {
    public List<String> commonChars(String[] words) {
         HashMap<Character,Integer>map1=new HashMap<>();
         String a=words[0];
         for(int i=0;i<a.length();i++){
         if(map1.containsKey(a.charAt(i))){
                map1.put(a.charAt(i),map1.get(a.charAt(i))+1);
         }
         else{
                map1.put(a.charAt(i),1);
         }
         }
    
    
    
         for(int i=1;i<words.length;i++){
                  HashMap<Character,Integer>map2=new HashMap<>();
                  String b=words[i];
                  for(int j=0;j<b.length();j++){
                        if(map2.containsKey(b.charAt(j))){
                                map2.put(b.charAt(j),map2.get(b.charAt(j))+1);
                 }
                 else{
                    map2.put(b.charAt(j),1);
                }
            }
            for(char key:map1.keySet()){
                if(map2.containsKey(key)){
                    int z=Math.min(map1.get(key),map2.get(key));
                    map1.put(key,z);
                }
                else{
                    map1.put(key,0);
                }
            }
            
        }
        List<String>list=new ArrayList<>();
        for(char key:map1.keySet()){
            for(int g=0;g<map1.get(key);g++){
                 list.add(String.valueOf(key));
            }
        }
        return list;
    }   
}