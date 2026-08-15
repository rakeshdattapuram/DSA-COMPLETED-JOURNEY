class Solution {
    public int trap(int[] height) {
    int total=0;
        int leftmax=0;
        int rightmax=0;
        int start=0;
        int end=height.length-1;
        while(start<end){
            leftmax=Math.max(leftmax,height[start]);
            rightmax=Math.max(rightmax,height[end]);
            if(leftmax<rightmax){
                total+=leftmax-height[start];
                start++;
            }
            else{
                total+=rightmax-height[end];
                end--;
            }
        }
        return total;
    }
}