class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0) return 0;
        int max = 1;
        int len = nums.length;
        Set<Integer> check = new HashSet<>();
        for(int num:nums) check.add(num);
        int temp = 0;
        for(int num:check){
            if(!check.contains(num-1)){
                temp = num;
                while(check.contains(temp)){
                    temp += 1;
                }
                max = (temp-num>max?temp-num:max);
            }
        }
        
        return max;

    }
}
