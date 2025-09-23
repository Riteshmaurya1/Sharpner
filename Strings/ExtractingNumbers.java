
import java.util.ArrayList;

class ExtractingNumbers{
    public static void main(String[] args){
        String str = "ritesh7845hgh45.vsfvfvv01";
        extractNums(str);
    }
    public static void extractNums(String str){
        ArrayList<String> list = new ArrayList<>();
        StringBuilder number = new StringBuilder();
        for(int i = 0; i < str.length();i++){
            char ch = str.charAt(i);
            if(ch >= '0' && ch <= '9'){
                number.append(ch);
            }else{
                if(number.length()>0){
                    list.add(number.toString());
                    number.setLength(0);
                }
            }
        }
        if(number.length()>0){
            list.add(number.toString());
        }
        System.out.print(list);
    }
}
