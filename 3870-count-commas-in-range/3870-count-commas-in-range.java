class Solution {
    public int countCommas(int n) {
        long total = 0;
        total+=Math.max(0,n-999);
        total+=Math.max(0,n-999_999);
        total+=Math.max(0,n-999_999_999);
        return (int) total;

        
    }
}