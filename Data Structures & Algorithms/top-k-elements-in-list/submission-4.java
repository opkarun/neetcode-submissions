class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> counter = new HashMap<>();
        int len = nums.length;
        ArrayList<Integer>[] freq = new ArrayList[len+1];
        for(int i=0;i<freq.length;i++) freq[i] = new ArrayList<>();
        for(int num:nums){
            if(!counter.containsKey(num)){
                counter.put(num,1);
            }
            else{
                counter.put(num,counter.get(num)+1);
            }
        }
        for(int key:counter.keySet()){
            freq[counter.get(key)].add(key);
        }
        int[] res = new int[k];
        int index = 0;
        for(int i=freq.length-1;i>=0;i--){
            if(k==0) return res;
            for(int num:freq[i]){
                res[index] = num;
                index++;
                k--;
            }
        }
        return res;
    }
}
