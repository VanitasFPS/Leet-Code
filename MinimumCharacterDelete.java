class Solution {
    public int minDeletions(String s) {
        int[] counts = new int[26];
        
        for (char c : s.toCharArray()) {
            counts[c - 'a']++;
        }
        Arrays.sort(counts);

        int deletions = 0;
        for (int i = 25; i >= 0; i--) {
            if (counts[i] == 0) {
                return deletions;
            }
            
            for (int j = i - 1; j >= 0; j--) {
                if (counts[j] == counts[i]) {
                    counts[j]--;
                    deletions++;
                } else {
                    break;
                }
            }
        }
        return deletions;
    }
}
    
