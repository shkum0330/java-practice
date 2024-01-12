package ch6.ex2;

import java.util.ArrayList;

public class ShoppingCart {
    private ArrayList<Item> items=new ArrayList<>();

    public ShoppingCart() {
        items=new ArrayList<>();
    }

    public void addItem(Item item){
        if(items.size()>=10){
            System.out.println("장바구니가 가득 찼습니다.");
            return;
        }
        items.add(item);
    }

    public void displayItems(){
        for (Item item : items) {
            System.out.println("상품명: "+item.getName()+", 합계: "+item.getPrice()*item.getQuantity());
        }
        System.out.println("전체 가격 합: "+getTotalPrice());
    }

    private int getTotalPrice(){
        int totalPrice=0;
        for (Item item : items) {
            totalPrice += item.getPrice()*item.getQuantity();
        }
        return totalPrice;
    }
}
