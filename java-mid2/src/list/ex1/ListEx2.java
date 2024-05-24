package list.ex1;

import java.util.ArrayList;
import java.util.Scanner;

public class ListEx2 {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();

        Scanner sc=new Scanner(System.in);
        System.out.println("n개의 정수를 입력하세요 (종료 0)");
        while (true){
            int num=sc.nextInt();
            if(num==0) break;
            list.add(num);
        }

        System.out.println("출력");
        StringBuilder sb=new StringBuilder();
        for (int i=0;i<list.size();i++){
            sb.append(list.get(i)+", ");
        }
        sb.delete(sb.length()-2,sb.length()-1);
        System.out.println(sb.toString());
    }
}
