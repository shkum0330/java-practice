package ch4.ex2;

import java.util.Random;

public class LottoGenerator {
    static int lotto[]=new int[6];
    static int idx=0;
    public static void main(String[] args) {
        Random random=new Random();

        for (int i = 0; i < 6; i++) {
            int num= random.nextInt(45)+1;
            if(!check(num)){
                i--;
                continue;
            }
            lotto[idx++]=num;
        }
        System.out.print("로또 번호: ");
        for (int i = 0; i < 6; i++) {
            System.out.print(lotto[i]+" ");
        }
    }
    static boolean check(int num){
        for (int i = 0; i < idx; i++) {
            if(num==lotto[i]) return false;
        }
        return true;
    }
}
