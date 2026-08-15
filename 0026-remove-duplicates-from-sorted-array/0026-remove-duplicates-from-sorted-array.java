class Solution {
    public int removeDuplicates(int[] nums) {
        int w=0;
        for(int r=1;r<nums.length;r++){
            if(nums[r]!=nums[w]){
                w++;
                int tmp=nums[r];
                nums[w]=tmp;
            }
        }
        return w+1;
    }
}