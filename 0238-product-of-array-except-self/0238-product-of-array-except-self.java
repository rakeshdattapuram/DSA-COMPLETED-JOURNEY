class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] result=new int[nums.length];
        result[0]=1;
        for(int i=1;i<nums.length;i++){
            result[i]=nums[i-1]*result[i-1];
        }
        int rightprod=1;
        for(int r=nums.length-1;r>=0;r--){
            result[r]=result[r]*rightprod;
            rightprod*=nums[r];


        }
        return result;
    }
}