package ch4.ex1;

public class WrapperTest4 {
    public static void main(String[] args) {
        String str = "100";

        // 코드 작성
        Integer integer1=Integer.parseInt(str);
        int intValue=integer1;
        Integer integer2=intValue;
        System.out.println("integer1 = "+integer1);
        System.out.println("intValue = "+intValue);
        System.out.println("integer2 = "+integer2);
    }
}
