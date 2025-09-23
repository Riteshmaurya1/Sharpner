class Qs1{
    public static void main(String[] args) {
        printPattern(5);
    }
    public static void printPattern(int n){
        String star = " * ";
        for(int row = 1; row <= n; row++){
            for(int cols = 1; cols <= row; cols++){
                System.out.print(star);
            }
            System.out.println();
        }
        for(int row = n; row >= 1; row--){
            for(int cols = row; cols >= 1; cols--){
                System.out.print(star);
            }
            System.out.println();
        }
    }
}
// Tc = O(n^2)
// Sc = O(1)