class Solution {
    public int numTimesAllBlue(int[] light) 
    {
        
        int maxE = -1;
        int ans = 0;
        for(int i = 0; i < light.length; i++){
            maxE = Math.max(maxE, light[i]);
            if((i+1) == maxE)ans++;
        }
        return ans;
    }

    }
