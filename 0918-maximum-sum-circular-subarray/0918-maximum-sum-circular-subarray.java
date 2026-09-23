class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int curMax=0;
        int curMin=0;
        int globalMin=nums[0];
        int globalMax=nums[0];
        int total=0;
        int circularSum=0;
        for(int i=0;i<nums.length;i++){
            curMax=Math.max(curMax+nums[i],nums[i]);
            curMin=Math.min(curMin+nums[i],nums[i]);
            total+=nums[i];
            globalMax=Math.max(globalMax,curMax);
            globalMin=Math.min(globalMin,curMin);
            
           

            
        }
         if(globalMax<0){
                return globalMax;
            }
            circularSum=total-globalMin;
         
           return Math.max(globalMax,circularSum);
    }
}