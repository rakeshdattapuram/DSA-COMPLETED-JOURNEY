class Solution {
    public boolean check(int[] nums) {
        int count=1;
        int[] result=new int[2*nums.length];
        System.arraycopy(nums,0,result,0,nums.length);
        System.arraycopy(nums,0,result,nums.length,nums.length);
        for(int i=1;i<result.length;i++){
            if(result[i-1]<=result[i]){
                count+=1;
            }
            else{
                count=1;
            }
            if(count==nums.length){
                return true;
            }
        }
        return nums.length==1;
    }
}