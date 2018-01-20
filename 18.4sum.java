class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
	List<List<Integer>> res = new ArrayList<List<Integer>>();
	int len = nums.length;
	if(len < 4){
	    return res;
	}
	Arrays.sort(nums);
	for(int i = 0; i < len; i++){
	    if(i > 0 && nums[i]==nums[i-1])
		continue;
	    for(int j = i+1; j < len; j++){
		if(j > i+1 && nums[j] == nums[j-1])
		    continue;
		int lo = j+1;
		int hi = len-1;
		int t = target-nums[i]-nums[j];
		while(lo < hi){
		    int s = nums[lo]+nums[hi];
		    if(s == t){
			List<Integer> tempList = new ArrayList<Integer>();
			tempList.add(nums[i]);tempList.add(nums[j]);
			tempList.add(nums[lo]);tempList.add(nums[hi]);
			res.add(tempList);
			while(lo+1 < hi && nums[lo+1]==nums[lo])   lo++;
			while(hi-1 > lo && nums[hi-1]==nums[hi])   hi--;
		    }
		    if(s < t) lo++;
		    else      hi--;
		}
	    }
	}
	return res;
    }
}
