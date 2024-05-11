package ch6.ex1;

import java.time.LocalDateTime;

public class TestPlus {
    public static void main(String[] args) {
        LocalDateTime time = LocalDateTime.of(2024, 1, 1, 0, 0, 0);
        System.out.println("기준 시각: "+ time);
        System.out.println("1년 2개월 3일 4시간 후의 시각: "+time.plusYears(1).plusMonths(2).plusDays(3).plusHours(4));
    }
}
