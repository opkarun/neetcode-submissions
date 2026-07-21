class Solution {

    public String encode(List<String> strs) {
        String res = "";
        for(String ele:strs){
            res += ele.length() + "#" + ele;
        }
        //System.out.println(res);
        return res;
        }

    public List<String> decode(String str) {
        List<String> s1 = new ArrayList<>();
        int lent = str.length();
        String tempo = "";
        String len = "";
        int prev = 0;
        int len1 = 0;
        for(int i=0;i<lent;i++){
            char temp = str.charAt(i);
            if(temp == '#'){
                if(i >= lent || prev >= lent) break;
                len = str.substring(prev, i);
                // System.out.println(str.charAt(prev)+" "+str.charAt(i-1));
                // System.out.println(len);
                len1 = Integer.parseInt(len);
                tempo = str.substring(i+1,i+1+len1);
                s1.add(tempo);
                tempo = "";
                prev = (i+len1+1);
                // System.out.println("i is = "+i);
                // System.out.println("len1 is = "+len1);
                // System.out.println("prev is = "+prev);
                i = i+len1;
            }
        }
        return s1;
    }
}
