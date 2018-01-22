class Solution {
    public int removeDuplicates(int[] nums) {
	int len = nums.length;
	if(len == 0)
	    return 0;
	int i = 0;
	int res = 0;
	for(i = 1; i < len; i++){
	    if(nums[i] <= nums[res]){
		int j = i;
		while(j < len && nums[j] <= nums[res]){
		    j++;
		}
		if(j < len){
		    int t = nums[j];
		    nums[j] = nums[i];
		    nums[i] = t;
		    res = i;
		}
	    }else
		res = i;
	}
	return res+1;
    }
}
