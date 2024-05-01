package ch3.ex2;

public class TestString10 {
    public static void main(String[] args) {
        String fruits = "apple,banana,mango";
        // 코드 작성
        String[] subStr=fruits.split(",");
        for (String s:subStr){
            System.out.println(s);
        }
        System.out.println("joinedString = "+String.join("->",subStr));
    }
}
