class Solution {
    public int myAtoi(String str) {
	int i = 0, sign = 1,total = 0;
	int len = str.length();
	while(i < len && str.charAt(i) == ' '){
	    i++;
	}
	
	if(i < len && (str.charAt(i) == '+' || str.charAt(i) == '-')){
	    sign = str.charAt(i) == '+' ? 1 : -1;
	    i++;
	}
	while(i < len){
	    int t = str.charAt(i) - '0';
	    if(t < 0 || t > 9)
		break;
	    if(Integer.MAX_VALUE /10 < total || (Integer.MAX_VALUE /10 == total && Integer.MAX_VALUE%10 < t)){
		return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
	    }
	    total = total*10 + t;
	    i++;
	}

	return sign * total;
    }
    

}
