package set.ex1;

import java.util.*;

public class UniqueNamesTest2 {
    public static void main(String[] args) {
        Integer[] inputArr = {30, 20, 20, 10, 10};
        // 코드 작성
        Set<Integer> set = new LinkedHashSet<>(List.of(inputArr));

        for (Integer i:set){
            System.out.println(i);
        }
    }
}
