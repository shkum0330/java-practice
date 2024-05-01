package ch3.ex2;

public class TestString9 {
    public static void main(String[] args) {
        String email = "hello@example.com";
        // 코드 작성
        String[] subStr=email.split("@");
        System.out.println("ID: "+subStr[0]);
        System.out.println("Domain: "+subStr[1]);
    }
}
