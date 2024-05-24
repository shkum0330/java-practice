package list.ex1;

import java.util.ArrayList;
import java.util.Scanner;

public class ListEx3 {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();

        Scanner sc=new Scanner(System.in);
        System.out.println("n개의 정수를 입력하세요 (종료 0)");
        while (true){
            int num=sc.nextInt();
            if(num==0) break;
            list.add(num);
        }
        int sum=0;
        double avg=0;

        for(int i=0;i<list.size();i++){
            sum += list.get(i);
        }
        System.out.println("입력한 정수의 합계: "+sum);
        System.out.println("입력한 정수의 평균: "+(double)sum/list.size());
    }
}
