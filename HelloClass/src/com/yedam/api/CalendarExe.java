package com.yedam.api;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class CalendarExe {
	public static void main(String[] args) {
		
		Date today = new Date();
		System.out.println(today.toString());
		
		//생성자의 매개값으로 포맷지정
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년MM월dd일 HH시mm분ss초");
		String timestr = sdf.format(today);
		System.out.println(timestr);
		
		try {
			today = sdf.parse("2025-08-01 09:00:00"); // String => Date
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Calendar now = Calendar.getInstance();
		
		// 시간 변경
		
		now.set(2025, 0, 1);
		now.set(Calendar.YEAR, 2024);
		
		int dayOfWeek = now.get(Calendar.DAY_OF_WEEK);
		switch(dayOfWeek) {
		case 1: System.out.println("일요일");
		case 2: System.out.println("월요일");
		case 3: System.out.println("화요일");
		case 4: System.out.println("수요일");
		case 5: System.out.println("목요일");
		case 6: System.out.println("금요일");
		case 7: System.out.println("토요일");
		}
		
		System.out.printf("년도 %d, 월: %d, 날짜: %d, 요일: %d, 말일: %d \n",now.get(Calendar.YEAR)
							, now.get(Calendar.MONTH)
							, now.get(Calendar.DATE)
							, now.get(Calendar.DAY_OF_WEEK)
							, now.getActualMaximum(Calendar.DATE));
		
		
		
	}
	
	public static void makeCalendar(int year, int month) { // 2025, 5
		System.out.println("   2025년 5월       \r\n"
				+ " sun mon tue wed thu fri sat\r\n"
				+ "============================\r\n"
				+ "                   1   2   3\r\n"
				+ "   4   5   6   7   8   9  10\r\n"
				+ "  12  13  14  15  16  17  18\r\n"
				+ "  19  20  21  22  23  24  25\r\n"
				+ "  26  27  28  29  30  31    \r\n"
				+ "-----------------------------");
	}
}
