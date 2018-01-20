class Solution {
    List<String> res = new ArrayList<String>();
    StringBuffer sb = new StringBuffer();
    int n1,numleft;
    public List<String> generateParenthesis(int n) {
	n1 = n;
	dfs(0);
	return res;
    }
    public void dfs(int m){
	if(sb.length() == 2*n1){
	    res.add(sb.toString());
	    return ;
	}
	if(numleft < n1){
	    sb.append('(');
	    numleft++;
	    dfs(m+1);
	    sb.deleteCharAt(sb.length() - 1);
	    numleft--;
	}
	
	if(m > 0){
	    sb.append(')');
	    dfs(m-1);
	    sb.deleteCharAt(sb.length() - 1);
	}
    }
}
