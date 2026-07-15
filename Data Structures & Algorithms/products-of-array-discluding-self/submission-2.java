class Solution {
    public int[] productExceptSelf(int[] nums) {
        int len = nums.length;
        int[] prefix = new int[len];
        prefix[0] = nums[0];
        for(int i=1;i<len;i++){
                prefix[i] = nums[i] * prefix[i-1];
            
        }
        int[] suffix = new int[len];
        suffix[len-1] = nums[len-1];
        for(int i=len-2;i>=0;i--){
            suffix[i] = nums[i] * suffix[i+1];
        }
        int[] arr = new int[len];
        for(int i=0;i<len;i++){
            if(i == 0){
                arr[i] = suffix[i+1];
            }
            else if(i == len-1)
            {
                arr[i] = prefix[i-1];
            }
            else{
                arr[i] = prefix[i-1] * suffix[i+1];
            }
            //System.out.println(Arrays.toString(prefix)+" "+Arrays.toString(suffix));
        }
        return arr;
    }
}  
