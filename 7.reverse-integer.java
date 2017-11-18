
class Solution {
    public int reverse(int x) {
	if(x == 0)
	    return 0;
	while(x % 10 == 0){
	    x /= 10;
	}
	StringBuffer sb = new StringBuffer();
	if(x < 0)
	    sb.append("-");
	while(x != 0){
	    sb.append(String.valueOf(Math.abs(x%10)));
	    x /= 10;
	}
	String s = sb.toString();
	try{
	    return Integer.parseInt(s);
	}catch(Exception e){
	    return 0;
	}
    }
}
