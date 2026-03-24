class Solution {
    private int daysneeded(int[] weights, int capacity){
        int dayss = 1;
        int load = 0;
        for(int i : weights){
            if(load+i>capacity){
                dayss++;
                load = i;
            }
            else{
                load+=i;
            }
        }
        return dayss;
    }
    public int shipWithinDays(int[] weights, int days) {
        int low = Arrays.stream(weights).max().getAsInt();
        int high = Arrays.stream(weights).sum();

        while(low<=high){
            int mid = low+(high-low)/2;
            if(daysneeded(weights, mid)<= days){
            high = mid-1;
        }
        else{
            low = mid+1;
        }
        
    }
        return low;
    }
}