package ch8.ex1;

public class AnonymousMain {
    public static void main(String[] args) {
        // 여기에서 Hello의 익명 클래스를 생성하고 hello()를 호출해라.
        Hello hello=new Hello() {
            @Override
            public void run() {
                System.out.println("Hello.hello");
            }
        };
        hello.run();
    }
}
