package ch3.ex1;

public class TestString6 {
    public static void main(String[] args) {
        String str = "start hello java, hello spring, hello jpa";
        String key = "hello";
        // 코드 작성
        int cnt=0;
        int index=str.indexOf(key);
        while (index>=0){
            index=str.indexOf(key,index+1);
            cnt++;
        }
        System.out.println(cnt);
    }
}
