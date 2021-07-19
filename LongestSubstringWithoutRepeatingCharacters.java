class Solution {
    public int lengthOfLongestSubstring(String s) {
        Map<Character,Integer> map = new HashMap();
    
    int maxLength = 0;
    int start = 0;
    
    for(int i=0;i<s.length();i++){
        
        Character c = s.charAt(i);
        
        start = Math.max(start,map.getOrDefault(c,0));
        maxLength = Math.max(maxLength,i-start+1);
        map.put(c,i+1);
        
    }    
    return maxLength;
}
    }