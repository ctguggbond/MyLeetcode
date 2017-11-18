class Solution {
    public boolean isPalindrome(int x) {
	if(x < 0)
	    return false;
	int t = x / 10;
	int t1 = 1;
	while(t > 0){
	    t /= 10;
	    t1 *= 10;
	}
	
	while(x > 0){
	    if(x/t1 != x % 10){
		break;
	    }
	    x = x%t1;
	    x /= 10;
	    t1 /= 100;
	}
	if(x <= 0)
	    return true;
	else
	    return false;
    }
}
