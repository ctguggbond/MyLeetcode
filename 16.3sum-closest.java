class Solution {
    public int threeSumClosest(int[] nums, int target) {
	int len = nums.length;
	if(len < 3)
	    return 0;
	int closet = nums[0]+nums[1]+nums[2];
	Arrays.sort(nums);
	for(int i = 0; i < len - 2; i++){
	    if(i>0 && i+1<len-2 && nums[i+1] == nums[i])
		continue;
	    int second = i+1;
	    int last = len-1;
	    while(second < last){
		int t = nums[i]+nums[second]+nums[last];
		if(t == target)
		    return target;
		if(Math.abs(t-target)< Math.abs(closet-target)){
		    closet = t;
		}
		if(t < target){
		    second++;
		}else{
		    last--;
		}
	    }
	}
	return closet;
    }
}
