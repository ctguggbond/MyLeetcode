class Solution {
    public String intToRoman(int num) {
	StringBuffer res = new StringBuffer();
	char d[][] = {
	    {'I','V'},
	    {'X','L'},
	    {'C','D'},
	    {'M',' '}
	};
	int t = 1000;
	int f = 3;
	while(t > 0){
	    int temp = num / t;
	    if(temp <4){ 
		while(temp-- > 0){
		    res.append(d[f][0]);
		}
	    }else if(temp == 4){
		res.append(d[f][0]);
		res.append(d[f][1]);
	    }else if(temp < 9){
		res.append(d[f][1]);
		temp = temp - 5;
		while(temp--  > 0){
		    res.append(d[f][0]);
		}
	    }else{
		res.append(d[f][0]);
		res.append(d[f+1][0]);
	    }
	    num = num % t;
	    t = t / 10;
	    f--;
	}
	return res.toString();
    }
}
