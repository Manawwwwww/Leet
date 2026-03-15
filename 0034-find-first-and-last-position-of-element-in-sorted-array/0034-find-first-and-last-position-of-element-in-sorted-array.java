class Solution {
    public int[] searchRange(int[] nums, int target) {
        return new int[]{findFirst(nums, target), findLast(nums, target)};
    }

    private int findFirst(int[] nums, int target) {
        int lo = 0, hi = nums.length - 1, idx = -1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (nums[mid] == target) {
                idx = mid;
                hi = mid - 1;     
            } else if (nums[mid] < target) {
                lo = mid + 1;
            } else {
                hi = mid - 1;
            }
        }
        return idx;
    }

    private int findLast(int[] nums, int target) {
        int lo = 0, hi = nums.length - 1, idx = -1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (nums[mid] == target) {
                idx = mid;
                lo = mid + 1;     
            } else if (nums[mid] < target) {
                lo = mid + 1;
            } else {
                hi = mid - 1;
            }
        }
        return idx;
    }
}