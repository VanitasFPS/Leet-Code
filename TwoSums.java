class Solution {
    public int[] twoSum(int[] nums, int target) {
        int s=0;
        int i=0,j=0;
        int k=0;
        for( i=0;i<nums.length-1;i++)
        {
         for( j=i+1;j<nums.length;j++)
         {
             s=s+nums[i]+nums[j];
             if(s==target)
             {
                 k=1;
                 break;
             }
             else
                 s=0;
         }
            if(k==1)
                break;
        }
        int arr[]=new int[2];
        arr[0]=i;
        arr[1]=j;
        return arr;
    }
}