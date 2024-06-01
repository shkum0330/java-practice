package compare;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class CardGameMain {
    public static void main(String[] args) {
        ArrayList<Card> cards=new ArrayList<>();
        for (int i=1;i<=13;i++) {
            for (int j = 0; j < 4; j++) {
                cards.add(new Card(i, j));
            }
        }
        Collections.shuffle(cards);

        ArrayList<Card> player1=new ArrayList<>();
        ArrayList<Card> player2=new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            if(i%2==0){
                player1.add(cards.removeFirst());
            }else {
                player2.add(cards.removeFirst());
            }
        }
        Collections.sort(player1);
        Collections.sort(player2);
        int sum1=0;
        int sum2=0;
        for (int i = 0; i < 5; i++) {
            sum1 += player1.get(i).getNum();
            sum2 += player2.get(i).getNum();
        }
        System.out.println("플레이어 1의 카드: "+player1+", 합계: "+sum1);
        System.out.println("플레이어 2의 카드: "+player2+", 합계: "+sum2);
        if(sum1>sum2){
            System.out.println("플레이어1 승리");
        }else if(sum1<sum2){
            System.out.println("플레이어2 승리");
        }else {
            System.out.println("무승부");
        }
    }

}
