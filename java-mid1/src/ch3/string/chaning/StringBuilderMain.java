package ch3.string.chaning;

public class StringBuilderMain {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        String str=sb.append("A").append("B").append("C").append("D")
                .insert(4,"Java")
                .delete(4,8)
                .reverse()
                .toString();

        System.out.println(str);
    }
}
