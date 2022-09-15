class Solution {
    public int search(int[] nums, int target) {
        int l=0;
        int r = nums.length-1;
        while(l<=r){
            int mid = l + (r-l)/2;
            if(nums[mid] == target) return mid;
            if(nums[l]<=nums[mid]){
                if(target>=nums[l] && target<nums[mid]) r = mid-1;
                else l = mid+1;
            }
            else{
                if(nums[mid]<target && target<=nums[nums.length-1]) l = mid+1;
                else r = mid-1;
            }
        }
        return -1;
    }
}