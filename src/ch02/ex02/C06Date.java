package ch02.ex02;

import java.time.LocalDate;
import java.time.LocalTime;

public class C06Date {
	public static void main(String[] args) {
		//오늘 날짜 시각
		LocalDate date = LocalDate.now();
		LocalTime time = LocalTime.now();
		
		System.out.println(date);
		System.out.println(time);
	}
}
