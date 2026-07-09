class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> check= new HashMap<>();
        int []ans = new int[2];
        int len = nums.length;
        for(int i=0;i<len;i++){
            if(!check.containsKey(target-nums[i])){
                check.put(nums[i],i);
            }
            else{
                ans[0] = check.get(target-nums[i]);
                ans[1] = i;
                return ans;
            }
        }
        return ans;
    }
}
