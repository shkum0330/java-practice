package ch3.string.method;

public class StringSplitJoinMain {
    public static void main(String[] args) {
        String str = "Apple,Banana,Orange";

        String[] splitStr=str.split(",");
        for(String s:splitStr){
            System.out.println(s);
        }

        String joinStr=String.join("-","A","B","C");
        System.out.println(joinStr);

        String result=String.join("-",splitStr);
        System.out.println(result);
    }
}
