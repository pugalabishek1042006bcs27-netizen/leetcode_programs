class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] p=pattern.split("");
	    String[] s1=s.split(" ");
	    boolean flag=true;
	    HashMap<String,String>map=new HashMap<>();
	    HashMap<String,String>map1=new HashMap<>();
	    for(int i=0;i<s1.length;i++){
	        if(p.length!=s1.length ){
                return false;
            }
	        if(map.containsKey(p[i])){
	            if(map.get(p[i]).equals(s1[i])){
	                flag=true;
	                continue;
	            }
	            else{
	                flag=false;
	                break;
	            }
	            
	        }
	        else{
	           if(map1.containsKey(s1[i])){
	               flag=false;
	               break;
	           }
	           else{
	              map.put(p[i],s1[i]);
	              map1.put(s1[i],p[i]);
	           }
	            
	        }
	    }
	    System.out.println(map);
	    System.out.println(map1);
	    if(flag){
	        return flag;
	    }
	    else{
	        return flag;
	    }
	}
}