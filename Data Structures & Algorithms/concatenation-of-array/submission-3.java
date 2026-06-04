class Solution {
    public int[] getConcatenation(int[] nums) {
        

        // array 2 times write it
        int n = nums.length;
        int[] ans = new int[n * 2];
        for(int i =0 ; i< n ;i++)
        {
            ans[i] = nums[i]; 
            ans[i+n] =  nums[i];

        }

        return ans;
    }

}