class Solution {
    public int[] moveZeroes(int[] nums) {
        int w=0;
        for(int r=0;r<nums.length;r++){
            if(nums[r]!=0){
                int tmp=nums[r];
                nums[r]=nums[w];
                nums[w]=tmp;
                w++;
            }
        }
        return nums;
    }
}