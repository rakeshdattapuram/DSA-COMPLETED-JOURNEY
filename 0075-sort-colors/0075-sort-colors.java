class Solution {
    private void swap(int arr[],int pos1,int pos2){
            int tmp=arr[pos1];
            arr[pos1]=arr[pos2];
            arr[pos2]=tmp;
        }
    public int[] sortColors(int[] nums) {
       
        int left=0;
        int right=nums.length-1;
        int middle=0;
         
    while(middle<=right){ 
        switch(nums[middle]){
            case 0:
            swap(nums,left,middle);
            middle++;
            left++;
            break;
            case 1:
            middle++;
            break;
            case 2:
            swap(nums,middle,right);
            right--;
            break;
        }
        
        }
         return nums;
        
    }
}