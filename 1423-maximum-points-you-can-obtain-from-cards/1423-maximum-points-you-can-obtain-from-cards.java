class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int totalSum=0;
        int windowSize=cardPoints.length-k;
        for(int num:cardPoints){
            totalSum+=num;
        }
        if(windowSize==0){
            return totalSum;
        }
        int windowSum=0;
        for(int right=0;right<windowSize;right++){
            windowSum+=cardPoints[right];
        }
        int minWindowSum=windowSum;
        for(int right=windowSize;right<cardPoints.length;right++){
            windowSum+=cardPoints[right];
            windowSum-=cardPoints[right-windowSize];
            minWindowSum=Math.min(minWindowSum,windowSum);
        }
        return totalSum-minWindowSum;
        
    }
}