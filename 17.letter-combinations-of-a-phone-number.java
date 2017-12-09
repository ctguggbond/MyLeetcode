class Solution {
    public List<String> letterCombinations(String digits) {
	List<String> res = new ArrayList<String>();
	if(digits==null || "".equals(digits))
	    return res;
	String dic [][] = {
	    {},
	    {},
	    {"a","b","c"},
	    {"d","e","f"},
	    {"g","h","i"},
	    {"j","k","l"},
	    {"m","n","o"},
	    {"p","q","r","s"},
	    {"t","u","v"},
	    {"w","x","y","z"}
	};
	int len = digits.length();
	int t = (int)(digits.charAt(0)-'0');
	
	for(int i = 0; i < dic[t].length; i++){
	    res.add(dic[t][i]);
	}
	
	for(int j = 1; j < len; j++){
	    int n = (int)(digits.charAt(j)-'0');
	    List<String> tempres = new ArrayList<String>();
	    for(int i= 0; i < dic[n].length; i++){
		for(String s :res){
		    tempres.add(s+dic[n][i]);
		}
	    }
	    res = tempres;
	    tempres = null;
	}
	return res;
    }
}
