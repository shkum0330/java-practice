package map.ex1;

import java.util.*;

public class ItemPriceTest {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("사과", 500);
        map.put("바나나", 500);
        map.put("망고", 1000);
        map.put("딸기", 1000);
        // 코드 작성
        Set<String> set=new HashSet<>();
        for (String key: map.keySet()){
            if(map.get(key)==1000){
                set.add(key);
            }
        }
        System.out.println(set);
    }
}
