package ch6.ex1;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class TestLoopPlus {
    public static void main(String[] args) {
        LocalDate date=LocalDate.of(2024,1,1);

        for (int i=0;i<5;i++){
//            System.out.println("날짜 "+(i+1)+": "+date.plusDays(14*i));
            System.out.println("날짜 "+(i+1)+": "+date.plus(2*i, ChronoUnit.WEEKS));
        }
    }
}
