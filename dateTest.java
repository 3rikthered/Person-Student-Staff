package nelsonTask1;

import java.util.*;

public class dateTest {
	class MyDate
	{
		private int year;
		private int month;
		private int day;
		  
		MyDate()
		{    
			GregorianCalendar date = new GregorianCalendar();
		    // Find year, month, and day from date. You write your own code to replace the out-dated get methods
		    year = date.get(Calendar.YEAR);
		    month = date.get(Calendar.MONTH);
		    day = date.get(Calendar.DAY_OF_MONTH);
		}
		  
		MyDate(long elapsedTime)
		{   
		    GregorianCalendar date = new GregorianCalendar();
		    date.setTimeInMillis(elapsedTime);
		    // Find year, month, and day from date. You write your own code to replace the out-dated get methods
		    year = date.get(Calendar.YEAR);
		    month = date.get(Calendar.MONTH);
		    day = date.get(Calendar.DAY_OF_MONTH);
		}
		    
		MyDate(int year, int month, int day)
		{
		    this.year = year;
		    this.month = month;
		    this.day = day;
		}
		  
		// GETTERS
		public int getYear()
		{
		    return year;
		}
	
		public int getMonth()
		{
		    return month;
		}
		  
		public int getDay()
		{
		    return day;
		}
		  
		// SETTERS
		public void setYear(int year)
		{
		    this.year = year;
		}
		  
		public void setMonth(int month)
		{
		    this.month = month;
		}
		  
		public void setDay(int day)
		{
		    this.day = day;
		}  
	}
}
