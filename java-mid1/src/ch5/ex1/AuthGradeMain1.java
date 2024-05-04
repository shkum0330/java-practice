package ch5.ex1;

public class AuthGradeMain1 {
    public static void main(String[] args) {

        for (AuthGrade grade:AuthGrade.values()){
            System.out.println("grade="+grade.name()+", level="+grade.getLevel()+", 설명="+grade.getDescription());
        }
    }
}
