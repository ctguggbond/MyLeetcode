class Solution {
    public int lengthOfLongestSubstring(String s) {
	java.util.Map<Character,Integer> map = new java.util.HashMap<Character,Integer>();
	
	int n = s.length();
	int res = 0;
	int len = 0;
	int start = 0;
	for(int i = 0; i < n; i++){
	    char c = s.charAt(i);
	    if(map.get(c) == null || map.get(c) == 0){
	    	len++;
		map.put(c,1);
	    }else{
	    	if(len > res)
	    	    res = len;
	    	int j = s.indexOf(c,start);
	    	for(int k = start; k < j; k++){
		    c = s.charAt(k);
		    map.put(c,0);
	    	    len--;
	    	}
	    	start = j+1; 
	    }
	    
	}
	if(len > res)
	    res = len;
	return res;
    }
}
