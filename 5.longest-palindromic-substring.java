class Solution {
    int a = 0,b = 0;
    int len = 0;
    public String longestPalindrome(String s) {
	int n = s.length();
	int j = 0;
	int k = 0;
	for(int i = 0; i < n; i++){
	    j = i;
	    k = i;
	    
	    getLen(j,k,n,s);
	    
	    if(i > 1 && s.charAt(i-1) == s.charAt(i)){
		j = i-1;
		k = i;
		getLen(j,k,n,s);
	    }else if(i < n-1 && s.charAt(i+1) == s.charAt(i)){
		j = i;
		k = i+1;
		getLen(j,k,n,s);
	    }
	    
	}
       
	return s.substring(a,b);
    }
    public void getLen(int j,int k,int n,String s){
	while(j >= 0 && k < n){
	    if(s.charAt(j) != s.charAt(k)){
		break;
	    }
	    j--;
	    k++;
	}
	if((k-j-1) > len){
	    len = k-j-1;
	    a = j+1;
	    b = k;
	}
    }

}
