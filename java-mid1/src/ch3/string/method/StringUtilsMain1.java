package ch3.string.method;

public class StringUtilsMain1 {
    public static void main(String[] args) {
        int num = 100;
        boolean bool = true;
        Object obj = new Object();
        String str = "Hello, Java!";

        System.out.println("숫자의 문자열 값: "+String.valueOf(num));
        System.out.println("불리언의 문자열 값: "+String.valueOf(bool));
        System.out.println("객체의 문자열 값: "+String.valueOf(obj));
        System.out.println("빈 문자열 + num: "+ "" +String.valueOf(num));


        char[] strCharArray=str.toCharArray();
        System.out.println("문자열을 문자 배열로 변환: " +strCharArray);
        for(char c:strCharArray){
            System.out.print(c);
        }

    }
}
