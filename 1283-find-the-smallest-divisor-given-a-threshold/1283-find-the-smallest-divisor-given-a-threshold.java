class Solution {
    public int smallestDivisor(int[] nums, int threshold) {

    int low = 1, high = Arrays.stream(nums).max().getAsInt();
    if(nums.length>threshold) return -1;
    while(low<=high){
        int mid = low+(high-low)/2;
        if(sumByd(nums, mid)<=threshold){
        high = mid-1;
    }
    else{
        low = mid+1;
    }

        
    }
    return low;
}

 private int sumByd(int[] nums, int div){
        int sum =0;
            for(int i : nums){
                sum+=Math.ceil((double)i/div);
            }
            return sum;
        }
}