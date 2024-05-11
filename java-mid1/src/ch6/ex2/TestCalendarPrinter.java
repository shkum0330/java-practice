package ch6.ex2;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Scanner;

public class TestCalendarPrinter {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("년도를 입력하세요: ");
        int year=sc.nextInt();
        System.out.print("월을 입력하세요: ");
        int month=sc.nextInt();

        LocalDate firstDay=LocalDate.of(year,month,1);
        LocalDate nextMonth= firstDay.plusMonths(1);
        int offsetWeekDays=firstDay.getDayOfWeek().getValue()%7;
        System.out.println("Su Mo Tu We Th Fr Sa ");
        for (int i=0;i<offsetWeekDays;i++){
            System.out.print("   ");
        }

        LocalDate day=firstDay;

        while (day.isBefore(nextMonth)){
            System.out.printf("%2d ",day.getDayOfMonth());

            day = day.plusDays(1);
            if(day.getDayOfWeek()== DayOfWeek.SUNDAY){
                System.out.println();
            }
        }
    }
}
