class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
	Arrays.sort(nums);
	List<List<Integer>> res = new ArrayList();
	int len = nums.length;
	for(int i = 0; i < len-2; i++){
	    if(i == 0 || nums[i] != nums[i-1]){
		int sum = 0-nums[i];
		int lo = i+1;
		int hi = len-1;
		while(lo < hi){
		    int t = nums[lo] + nums[hi];
		    if(t == sum){
			res.add(Arrays.asList(nums[i],nums[lo],nums[hi]));
			while(lo < hi && nums[lo] == nums[lo+1]) lo++;
			while(lo < hi && nums[hi] == nums[hi-1]) hi--;
			lo++;
			hi--;
		    }
		    else if(t < sum)
			lo++;
		    else
			hi--;
		}
	    }
	}
	return res;
    }
}
