package com.company;
import java.time.DayOfWeek;
import java.time.LocalDate;

/*
 *@version 2019.4.14
 *@author minglang
 */

public class CalendarTest {
    public static void main(String[] args){
        LocalDate date=LocalDate .now();
        int month=date.getMonthValue();
        int today=date.getDayOfMonth();

        date=date.minusDays(today-1);
        DayOfWeek weekday=date.getDayOfWeek() ;
        int value=weekday.getValue();

        System.out.println("MON TUE WED THU FRI SAT SUN");


        for (int i=1;i<value;i++)
        {
            System.out.println("     ");
        }
        while(date.getMonthValue()==month){
            //System.out.println("程序执行了！");
            System.out.printf("%3d",date.getDayOfMonth());
            //System.out.println("%3d",date.getDayOfMonth());
            if(date.getDayOfMonth()==today){
                System.out.print("**");
            }
            else{
                System.out.print(" ");
            }
            date=date.plusDays(1);
            if(date.getDayOfWeek().getValue()==1)System.out.println();
        }

        if(date.getDayOfWeek().getValue()!=1)System.out.println();
    }
}
