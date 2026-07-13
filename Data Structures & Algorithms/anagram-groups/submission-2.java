

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        // 1. Initialize the HashMap: res = {}
        Map<String, List<String>> res = new HashMap<>();

        // 2. Loop through each string: for i in strs:
        for (String i : strs) {
            
            // 3. Create the 26-character count array: lis = [0] * 26
            int[] lis = new int[26];
            for (char j : i.toCharArray()) {
                int index = j - 'a'; // ord(j) - ord('a')
                lis[index]++;
            }

            // 4. Convert the array to a unique string key: check = str(lis)
            String check = Arrays.toString(lis);

            // 5. If key not in map, create bucket: if check not in res:
            if (!res.containsKey(check)) {
                res.put(check, new ArrayList<>());
            }
            
            // 6. Append string to the matching bucket
            res.get(check).add(i);
        }

        // 7. CONVERT AND RETURN: return list(res.values())
        return new ArrayList<>(res.values());
    }
}


