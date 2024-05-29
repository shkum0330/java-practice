package map.ex1;

import java.util.HashMap;
import java.util.Map;

public class CommonKeyValueSum1 {
    public static void main(String[] args) {
        Map<String, Integer> map1 = new HashMap<>();
        map1.put("A", 1);
        map1.put("B", 2);
        map1.put("C", 3);
        Map<String, Integer> map2 = new HashMap<>();
        map2.put("B", 4);
        map2.put("C", 5);
        map2.put("D", 6);
        // 코드 작성
//        StringBuilder sb=new StringBuilder();
//        sb.append("{");
//        for (String a: map1.keySet()){
//            for (String b: map2.keySet()){
//                if(a.equals(b)){
//                    sb.append(a+"="+(map1.get(a)+map2.get(b))+", ");
//                }
//            }
//        }
//        sb.append("}");
//        sb.replace(sb.length()-3,sb.length()-1,"");
//        System.out.println(sb.toString());
        Map<String, Integer> result = new HashMap<>();
        for (String key : map1.keySet()) {
            if (map2.containsKey(key)) {
                result.put(key, map1.get(key) + map2.get(key));
            }
        }
        System.out.println(result);
    }
}
