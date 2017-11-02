class Solution {
    public int[] twoSum(int[] nums, int target) {
	Map<Integer,Integer> map = new HashMap<Integer,Integer>();
	int n = nums.length;
	int res [] = new int[2];
	for(int i = 0; i < n; i++){
	    if(map.get(target - nums[i]) != null){
		res[0] = map.get(target-nums[i]);
		res[1] = i;
		return res;
	    }
	    map.put(nums[i],i);
	}
	return null;
    }
}
