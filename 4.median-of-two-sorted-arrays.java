class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
	int n = nums1.length;
	int m = nums2.length;
	
	int mid = (n+m) / 2;
	int i = 0; 
	int j = 0;
	int d = 0;
	while(i < n && j < m && (i+j) < mid){
	    if(nums1[i] > nums2[j]){
		d = nums2[j];
		j++;
	    }
	    else{
		d = nums1[i];
		i++;
	    }
	}
	while(i < n && (i+j) < mid){
	    d = nums1[i];
	    i++;
	}
	while(j < m && (i+j) < mid){
	    d = nums2[j];
	    j++;
	}
	double res = 0;
	if(i < n && j < m){
	    res = ((n+m) % 2 == 0) ? (Math.min(nums1[i],nums2[j])+ d)/2.0 : Math.min(nums1[i],nums2[j]); 
	}else if(i < n){
	    res = ((n+m) % 2) == 0 ? (nums1[i]+d) / 2.0 : nums1[i];
	}else{
	    res = ((n+m) % 2) == 0 ? (nums2[j]+d) / 2.0 : nums2[j];
 	}
	return res;
    }
}
