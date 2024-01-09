package ch2.ex;

public class ProductOrderMain {
    public static void main(String[] args) {
        ProductOrder[] orders=new ProductOrder[3];
        orders[0]=createOrder("두부",2000,2);
        orders[1]=createOrder("김치",5000,1);
        orders[2]=createOrder("콜라",1500,2);

        for (ProductOrder order : orders) {
            printOrders(order);
        }

        System.out.println("총 결제 금액: "+getTotalAmount(orders));
    }

    static ProductOrder createOrder(String name,int price, int quantity){
        ProductOrder order=new ProductOrder();
        order.productName=name;
        order.price=price;
        order.quantity=quantity;
        return order;
    }

    static void printOrders(ProductOrder order){
        System.out.println("상품명: " + order.productName + ", 가격: "+order.price+ ", 수량: "+order.quantity);
    }

    static int getTotalAmount(ProductOrder[] orders){
        int totalAmount=0;
        for (ProductOrder order : orders) {
            totalAmount += order.price * order.quantity;
        }
        return totalAmount;
    }

}
