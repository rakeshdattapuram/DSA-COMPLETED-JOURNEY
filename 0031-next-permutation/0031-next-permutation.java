class Solution {

    public int[] nextPermutation(int[] nums) {
        int ind=-1;
            
       
        for(int i=nums.length-2;i>=0;i--){
            if(nums[i]<nums[i+1]){
                ind=i;
                break;
            }
        }
        if(ind==-1){
            reverse(nums,0,nums.length-1);
            return nums;
        }
        for(int i=nums.length-1;i>ind;i--){
            if(nums[i]>nums[ind]){
                swap(nums,i,ind);
                break;
            }
        }
        reverse(nums,ind+1,nums.length-1);
        return nums;
        
    }
public void reverse(int[]nums,int left,int right){
           
            while(left<right){
                int temp=nums[left];
                nums[left]=nums[right];
                nums[right]=temp;
                right--;
                left++;
            }
    

        }
public void swap(int nums[],int i,int j){
            int temp=nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
          
        }
        
}