class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low=1;
        int high =0;
        int ans=0;
        for(int pile:piles){
            high=Math.max(high,pile);

        }
        while(low<=high){
            int mid=low+(high-low)/2;
            if(caneat(mid,piles,h)){
                ans=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return ans;
    }
    public boolean caneat(int k,int[] piles,int h){
        long hours=0;
        for(int pile:piles){
            hours+=(pile+k-1)/k;
        }
        return hours<=h;
    }
}