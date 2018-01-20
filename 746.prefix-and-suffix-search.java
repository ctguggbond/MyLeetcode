class WordFilter {
    
    Map<String,Integer> map = new HashMap<String,Integer>();
    
    public WordFilter(String[] words) {
	int len = words.length;
        for(int i = 0; i < len; i++){
	    int len1 = words[i].length();
	    for(int j = 0; j <= len1; j++){
		for(int k = 0; k <= len1; k++){
		    String prefix = words[i].substring(0,j);
		    String suffix = words[i].substring(k,len1);
		    String mykey = prefix+'|'+suffix;
		    map.put(mykey,i);
		}
	    }
	}
    }
    public int f(String prefix, String suffix) {
        String mykey = prefix+'|'+suffix;
	return map.containsKey(mykey) ? map.get(mykey) : -1;
    }
}

/**
 * Your WordFilter object will be instantiated and called as such:
 * WordFilter obj = new WordFilter(words);
 * int param_1 = obj.f(prefix,suffix);
 */
