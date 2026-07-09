class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        int []arr1 = new int[26];
        int len = s.length();
        for(int i=0;i<len;i++){
            arr1[s.charAt(i)-'a']++;
            arr1[t.charAt(i)-'a']--;
        }
        for(int num: arr1){
            if(num != 0) return false;
        } 
        return true;  
    }
}
