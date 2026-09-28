class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> res=new ArrayList<>();
        Map<Character,Integer> map=new HashMap<>();
        int left=0;
        int count=p.length();
        if(s.length()<p.length()){
            return res;
        }
        for(char c:p.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);

        }

        for(int right=0;right<s.length();right++){
            char ch=s.charAt(right);
            int val=map.getOrDefault(ch,0);
            if(val>0){
                count--;
            }
            map.put(ch,val-1);
            if(right-left+1>p.length()){
                char leftChar=s.charAt(left);
                int leftValue=map.getOrDefault(leftChar,0);
                if(leftValue>=0){
                    count++;
                }
                map.put(leftChar,leftValue+1);
                left++;
            }
            if(count==0){
                res.add(left);
            }
        }
        return res;
    }
}