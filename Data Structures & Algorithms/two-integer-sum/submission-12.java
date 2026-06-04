class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i =0; i<nums.length;i++)
        
        {
            int validate =  target - nums[i];

            if(map.containsKey(validate))
            
            {
                return new int[] {map.get(validate),i};
            }

            map.put(nums[i],i);

        }

        return null;
    }


}