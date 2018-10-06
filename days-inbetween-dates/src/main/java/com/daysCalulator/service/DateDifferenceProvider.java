package com.daysCalulator.service;
import com.daysCalulator.pojo.MyDate;

public class DateDifferenceProvider {
	
   static final int JAN_DAYS=31;
   static final int FEB_DAYS=28;
   static final int MAR_DATE=31;
   static final int APRIL_DAYS=30;
   static final int MAY_DAYS=31;
   static final int JUNE_DAYS=30;
   static final int JULY_DAYS=31;
   static final int AUGUST_DAYS=31;
   static final int SEPTEMBER_DAYS=30;
   static final int OCTOBER_DAYS=31;
   static final int NOVEMBER_DAYS=30;
   static final int DECEMBER_DAYS=31;
   
   static int[] yearMonths= {
		   0,
		   JAN_DAYS,
		   FEB_DAYS,
		   MAR_DATE,
		   APRIL_DAYS,
		   MAY_DAYS,
		   JUNE_DAYS,
		   JULY_DAYS,
		   AUGUST_DAYS,
		   SEPTEMBER_DAYS,
		   OCTOBER_DAYS,
		   NOVEMBER_DAYS,
		   DECEMBER_DAYS
   };

	public static long getDateDifference(MyDate startDate, MyDate endDate)
	{
		if(sameDay(startDate, endDate)&&sameMonth(startDate, endDate)&&sameYear(startDate, endDate))
		{
			return 0;
		}
		else if(!sameDay(startDate, endDate)&&sameMonth(startDate, endDate)&&sameYear(startDate, endDate))
		{
			return RemainingDays(startDate, endDate);
		}
		else if(!sameDay(startDate, endDate)&&!sameMonth(startDate, endDate)&&sameYear(startDate, endDate))
		{
			return RemainingDays(startDate, endDate)+RemainingMonthsSameYear(startDate, endDate);
		}
		else if(sameDay(startDate, endDate)&&!sameMonth(startDate, endDate)&&sameYear(startDate, endDate))
		{
			return RemainingDays(startDate, endDate)+RemainingMonthsSameYear(startDate, endDate);
		}
		else if(!sameDay(startDate, endDate)&&!sameMonth(startDate, endDate)&&!sameYear(startDate, endDate))
		{
			if(endDate.getYyyy()-startDate.getYyyy()>=2)
			{
				return RemainingDays(startDate, endDate)+remainingMonthsDifferentYears(startDate, endDate)+interimYearDays(startDate, endDate); 
			}
			else
			return RemainingDays(startDate, endDate)+remainingMonthsDifferentYears(startDate, endDate);
		}
		else
		{
			return 1;
		}
	}
	
	
	
	
	
	private static boolean sameDay(MyDate startDate, MyDate endDate)
	{
		if(startDate.getDd()==endDate.getDd())
			return true;
		else
			return false;
	}
	private static boolean sameMonth(MyDate startDate, MyDate endDate)
	{
		if(startDate.getMm()==endDate.getMm())
			return true;
		else
			return false;
	}
	private static boolean sameYear(MyDate startDate, MyDate endDate)
	{
		if(startDate.getYyyy()==endDate.getYyyy())
			return true;
		else
			return false;
	}
	
	
	private static int RemainingDays(MyDate startDate,MyDate endDate)
	{
		int bonusDay=0;
		if(startDate.getMm()==2)
			bonusDay++;
		if(startDate.getMm()==endDate.getMm())
			return endDate.getDd()-startDate.getDd();
		else
			return yearMonths[startDate.getMm()]-startDate.getDd()+endDate.getDd()+bonusDay;
	}
	
	private static int RemainingMonthsSameYear(MyDate startDate,MyDate endDate)
	{
		if(endDate.getMm()-startDate.getMm()>=2)
		{
		int monthDays=0;
		int bonusDay=0;
		for(int index=startDate.getMm()+1;index<endDate.getMm();index++)
		{
			if(startDate.getYyyy()%4==0)
			{
			if(index==2)
				bonusDay++;
			}
			monthDays+=yearMonths[index];
		}
		return monthDays+bonusDay;
		}
		else
		{
			return 0;
		}
	}
	
	private static boolean isYearLeap(int year)
	{
        boolean leap = false;
        if(year % 4 == 0)
  {
      if( year % 100 == 0)
      {
          if ( year % 400 == 0)
              leap = true;
          else
              leap = false;
      }
      else
          leap = true;
  }
  else
      leap = false;
  return leap;

	}
	
	private static long remainingMonthsDifferentYears(MyDate startDate, MyDate endDate)
	{
		int startYear=startDate.getYyyy();
		int endYear=endDate.getYyyy();
		int monthDaysStart=0;
		int monthDaysEnd=0;
		int bonusDay=0;
		if(isYearLeap(startYear)||isYearLeap(endYear))
		{
			if(startDate.getMm()<1)
				bonusDay++;
			if(endDate.getMm()>2)
				bonusDay++;
		}
		for(int index=startDate.getMm()+1;index<=12;index++)
		{
			monthDaysStart+=yearMonths[index];
		}
		for(int index=1;index<endDate.getMm();index++)
		{
			monthDaysEnd+=yearMonths[index];
		}
		
		return monthDaysStart+monthDaysEnd+bonusDay;
	}
	
	public static long interimYearDays(MyDate startDate, MyDate endDate)
	{
		int startYear=startDate.getYyyy();
		int endYear=endDate.getYyyy();
		int daysInAYear=0;
		int totalDays = 0;
		for(int index=startYear+1;index<endYear;index++)
		{
			if(isYearLeap(index))
				daysInAYear=366;
			else
				daysInAYear=365;
			totalDays+=daysInAYear;
		}
		return totalDays;
	}
}
