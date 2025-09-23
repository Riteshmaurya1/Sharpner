public class ValidateString {
    public static void main(String[] args) {
        String str = "madam";
        System.out.println(palindrome(str));
    }
    public static boolean palindrome(String str){
        StringBuilder sb = new StringBuilder();
        for(int i = str.length()-1; i >= 0; i--){
            sb.append(str.charAt(i));
        }
        return str.equals(sb.toString());
    }
}
