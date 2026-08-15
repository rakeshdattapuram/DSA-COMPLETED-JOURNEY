class Solution {
    public char[] reverseString(char[] s) {
        int r=s.length-1;
        int l=0;
        while(l<r||l==r){
            char tmp=s[r];
            s[r]=s[l];
            s[l]=tmp;
            l++;
            r--;

        }
        return s;
    }
}