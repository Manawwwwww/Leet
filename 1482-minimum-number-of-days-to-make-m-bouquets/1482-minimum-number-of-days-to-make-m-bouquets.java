class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        if((long)m*k>bloomDay.length) return -1;
        int mindays = Integer.MAX_VALUE;
        int maxdays = Integer.MIN_VALUE;
        for(int bloom: bloomDay){
            mindays =  Math.min(mindays,bloom);
            maxdays = Math.max(maxdays,bloom);
        }
        int answer = -1;

        int low = mindays , high = maxdays;
        while(low<=high){
            int mid = low+(high-low)/2;
            if(canMake(bloomDay,m,k,mid)){
            answer = mid;
            high = mid-1;


        }
        else{
            low = mid+1;
        }

        
    }
    return answer;
}
    private boolean canMake(int[] bloomDay, int m, int k, int day) {
        int bouquets = 0;
        int flowers = 0;

        for (int bloom : bloomDay) {
            if (bloom <= day) {
                flowers++;
                if (flowers == k) {
                    bouquets++;
                    flowers = 0;
                }
            } else {
                flowers = 0; 
            }
        }

        return bouquets >= m;
    }
}