class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        
        String[] st=s1.split(" ");
        String[] st1=s2.split(" ");
        ArrayList<String>list=new ArrayList<>();
        int index=0;
        HashMap<String,Integer>map=new HashMap<>();
        HashMap<String,Integer>map1=new HashMap<>();
        for(String a:st){
            if(map.containsKey(a)){
                map.put(a,map.get(a)+1);
            }
            else{
                map.put(a,1);
            }
        }
        for(String a:st1){
            if(map1.containsKey(a)){
                map1.put(a,map1.get(a)+1);
            }
            else{
                map1.put(a,1);
            }
        }

        for(String a:map.keySet()){
            
            if(map.get(a)==1 && !map1.containsKey(a)){
                list.add(a);
            }
            else{
                continue;
            }

        }
        for(String a:map1.keySet()){
            if(map1.get(a)==1 && !map.containsKey(a)){
                list.add(a);
            }
            else{
                continue;
            }
        }
        return list.toArray(new String[0]);

    }
}