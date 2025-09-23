public class ReverseWords {
    public static void main(String[] args) {
        String str = "hello ritesh maurya";
        System.out.println(revserWord(str));
    }

    public static String revserWord(String s) {
        String strArr[] = s.split(" ");
        StringBuilder str = new StringBuilder();
        for (int i = strArr.length - 1; i >= 0; i--) {
            if (strArr[i].length() == 0) {
                continue;
            }
            if (str.length() == 0) {
                str.append(strArr[i]);
            } else {
                str.append(" ");
                str.append(strArr[i]);
            }
        }
        System.out.print(str.toString()+" ");
        return str.toString();
    }
}
// int startIndex = s.length() - 1;
// while (startIndex >= 0) {
// // remove spaces.
// while (startIndex >= 0 && s.charAt(startIndex) == ' ') {
// startIndex--;
// }
// // if we reach at
// if (startIndex < 0) {
// break;
// }
// int endIndex = startIndex;
// while (startIndex >= 0 && s.charAt(startIndex) != ' ') {
// startIndex--;
// }
// if (str.isEmpty()) {
// str.append(s.substring(startIndex+1,endIndex+1));
// }
// else{
// str.append(" ");
// str.append(s.substring(startIndex+1,endIndex+1));
// }

// }
