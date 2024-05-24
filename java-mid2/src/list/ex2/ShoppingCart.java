package list.ex2;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

    List<Item> itemList=new ArrayList<>();

    public void addItem(Item item) {
        itemList.add(item);
    }

    public void displayItems() {
        System.out.println("장바구니 상품 출력");
        int sum=0;
        for(Item i:itemList){
            System.out.println("상품명:"+i.getName()+", 합계:"+i.getTotalPrice());
            sum += i.getTotalPrice();
        }
        System.out.println("전체 가격 합:"+sum);
    }
}
