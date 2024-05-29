package map.ex2.cart;

import java.util.HashMap;
import java.util.Map;

public class Cart {

    Map<Product,Integer> productMap=new HashMap<>();
    public void add(Product product, int quantity) {
        productMap.put(product,productMap.getOrDefault(product,0)+quantity);
    }

    public void printAll(){
        System.out.println("==모든 상품 출력==");
        for (Product product:productMap.keySet()) {
            System.out.println("상품: "+product+" 수량: "+productMap.get(product));
        }
    }

    public void minus(Product product, int quantity) {
        if(productMap.containsKey(product)){
            if(productMap.get(product)-quantity<=0){
                productMap.remove(product);
            }else{
                productMap.put(product,productMap.get(product)-quantity);
            }
        }
    }
}
