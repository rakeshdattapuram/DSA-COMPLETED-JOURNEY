class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int count=0;
        int sum=0;
        for(int right=0;right<k;right++){
            sum+=arr[right];
        }
        if(sum>=k*threshold){
            count++;
        }
        for(int right=k;right<arr.length;right++){
            sum+=arr[right];
            sum-=arr[right-k];
            if(sum>=k*threshold){
                count++;
            }
        }
        return count;
    }
}