package map.ex1;

import java.util.HashMap;
import java.util.Map;

public class WordFrequencyTest1 {
    public static void main(String[] args) {
        String text = "orange banana apple apple banana apple";
        // 코드 작성
        String[] tokens=text.split(" ");
        Map<String,Integer> map=new HashMap<>();
//        for(String s:tokens){
//            Integer cnt=map.get(s);
//            if(cnt==null){
//                map.put(s,0);
//                continue;
//            }
//            cnt++;
//            map.put(s,cnt);
//        }
        for (String s : tokens) {
            map.put(s, map.getOrDefault(s, 0) + 1);
        }
        System.out.println(map);
    }
}
