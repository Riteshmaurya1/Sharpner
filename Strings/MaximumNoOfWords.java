public class MaximumNoOfWords {
        public static void main(String[] args) {
        String str = "alice and bob love leetcode i think so too.this is great thanks very much";
        System.out.println(maxLenWord(str));
    }
    public static int maxLenWord(String s){
        String words[] = s.split(" ");
        int maxLen = 0;
        for(int i = 0; i < words.length; i++){
            maxLen = Math.max(maxLen,(words[i].length()));
        }
        return maxLen;
    }
}
