class Solution {
    public int maxProduct(int[] nums) {
        int max=nums[0];
        int min=nums[0];
        int ans=nums[0];
        for(int i=1;i<nums.length;i++){
            int x=nums[i];
            int tempMax=Math.max(x, Math.max(min*x,max*x));
                int tempMin=Math.min(x, Math.min(min*x,max*x));
            max=tempMax;
            min=tempMin;
            ans=Math.max(ans,max);
        }
         return ans;
    }
}