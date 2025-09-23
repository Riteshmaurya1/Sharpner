
import java.util.HashMap;

public class charFerquency {
     public static void main(String[] args){
        String str = "hddddd";
        charFrq(str);
    }
    public static void charFrq(String str){
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            map.put(ch, map.getOrDefault(ch,0)+1);
        }
        System.out.println(map);
    }
}
