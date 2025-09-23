public class checkTwoStringsaAreAnagram {
    public static void main(String[] args) {
        String str1 = "cabbt";
        String str2 = "tabbc";
        System.out.println(checkAnagram(str1,str2));
    }
    public static boolean checkAnagram(String str1, String str2){
        if(str1.length() != str2.length()) return false;
        // char arrA [] = str1.toCharArray();
        // char arrB [] = str2.toCharArray();
        // Arrays.sort(arrA);
        // Arrays.sort(arrB);
        // int idxA = 0;
        // int idxB = 0;
        // while(idxA < arrA.length && idxB < arrB.length){
        //     if(arrA[idxA] != arrB[idxB]) return false;
        //     idxA++;
        //     idxB++;
        // }
        // Tc => O(N^2);

        // Optimised Way
        int frq[] = new int [26];
        int idxA = 0;
        int idxB = 0;
        while(idxA < str1.length() && idxB < str2.length()){
            char charA = str1.charAt(idxA);
            int freqIndexA = charA - 97;
            frq[freqIndexA] +=1; 

            char charB = str2.charAt(idxB);
            int freqIndexB = charB - 97;
            frq[freqIndexB] -=1; 
            idxA++;
            idxB++;
        }
        for(int i = 0; i < str1.length(); i++){
            if(frq[i] != 0){
                return false;
            }
        }
        return true;
    }
}

