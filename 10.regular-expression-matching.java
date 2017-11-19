class Solution {
    public boolean isMatch(String s, String p) {
	int i = s.length();
	int j = p.length();
	return help(s,i-1,p,j-1);
    }
    
    public boolean help(String s,int i,String p, int j){
	
	if(j < 0){
	    if(i < 0)
		return true;
	    else
		return false;
	}
	
	if(p.charAt(j) == '*'){//为* j一定大于0
	    if(i >= 0 &&(p.charAt(j-1) == s.charAt(i) || p.charAt(j-1)=='.')){
		if(help(s,i-1,p,j))
		    return true;
	    }
	    return help(s,i,p,j-2);
	}
	
	if(i >= 0 && (s.charAt(i) == p.charAt(j) || p.charAt(j)=='.')){
	    return help(s,i-1,p,j-1);
	}
	return false;
    }
}
