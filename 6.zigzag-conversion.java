class Solution {
    public String convert(String s, int numRows) {
	StringBuffer sb = new StringBuffer();
	int len = s.length();
	if(numRows == 1)
	    return s;
	for(int i = 0; i < numRows && i < len; i++){
	    int n = 0;
	    int j = i;
	    if(i == 0 || i == numRows-1)
	    {
		n = 2*numRows-2;
		while(j  < len){
		    sb.append(s.charAt(j));
		    j = j+n;
		}
	    }
	    else
	    {
		boolean flag = true;
		while(j < len){
		    n = flag ? 2*(numRows-i-1) : 2*i; 
		    sb.append(s.charAt(j));
		    j = j + n;
		    flag = !flag;
		}		
	    }
	}
	return sb.toString();
    }
    
}
