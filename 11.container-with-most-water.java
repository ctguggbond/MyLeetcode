class Solution {
    public int maxArea(int[] height) {
	int len = height.length;
	int a = 0;
	int b = len - 1;
	int res = 0;
	while(a != b){
	    if(height[a] < height[b]){
		res = Math.max(height[a]*(b-a),res);
		a++;
	    }else{
		res = Math.max(height[b]*(b-a),res);
		b--;
	    }
	}
	return res;
    }
}
