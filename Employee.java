package nelsonTask1;

public class Employee extends Person
{
	private String office;
	private double salary;
	private MyDate dateHired;
	
	public Employee(String name,  String address, String phoneNumber,
			        String emailAddress, String office, double salary,
			        MyDate dateHired)
	{	
		super(name, address, phoneNumber, emailAddress);
		
		this.office = office;
		this.salary = salary;
		
		// Establish today's date
		MyDate today = new MyDate();
						
		// If the date would occur in the future, it is instead set to today
		if (dateHired.getYear() >= today.getYear() &&
			dateHired.getMonth() >= today.getMonth() &&
			dateHired.getDay() > today.getDay())
		{
			dateHired = today;
		}		
		this.dateHired = realDate(dateHired);
	}
	
	// GETTERS
	public String getOffice()
	{
		return office;
	}
	

	public double getSalary()
	{
		return salary;
	}

	public MyDate getDateHired()
	{
		return dateHired;
	}

	// SETTERS
	public void setOffice(String office)
	{
		this.office = office;
	}

	public void setSalary(double salary)
	{
		this.salary = salary;
	}

	public void setDateHired(MyDate dateHired)
	{
		// Establish today's date
		MyDate today = new MyDate();
				
		// If the date would occur in the future, it is instead set to today
		if (dateHired.getYear() >= today.getYear() &&
			dateHired.getMonth() >= today.getMonth() &&
			dateHired.getDay() > today.getDay())
		{
			dateHired = today;
		}
		this.dateHired = realDate(dateHired);
	}
	
	
	// method to ensure a date is exists and is not in the future
	public static MyDate realDate(MyDate date)
	{
		// Ensure month is in the range 0 - 11
		if (date.getMonth() > 11)
		{
			date.setMonth(11);
		}
		if (date.getMonth() < 0)
		{
			date.setMonth(0);
		}
			
		// Ensure day is greater than 0
		if (date.getDay() < 1)
		{
			date.setDay(1);
		}
		
		// Ensure that the day actually exists for the given month
		// February includes an extra condition to account for leap years
		switch (date.getMonth())
		{
			// Jan
			case 0: if (date.getDay() > 31)
					{
						date.setDay(31);
					}
					break;
			// Feb
			case 1: if (date.getYear() % 4 == 0)
					{
						if (date.getDay() > 29)
						{
							date.setDay(29);
						}
					}
					else
					{
						if (date.getDay() > 28)
						{
							date.setDay(28);
						}
					}
			// Mar
			case 2: if (date.getDay() > 31)
					{
						date.setDay(31);
					}
					break;
			// Apr
			case 3: if (date.getDay() > 30)
					{
						date.setDay(30);
					}
					break;
			// May
			case 4: if (date.getDay() > 31)
					{
						date.setDay(31);
					}
					break;
			// Jun
			case 5: if (date.getDay() > 30)
					{
						date.setDay(30);
					}
					break;
			// Jul
			case 6: if (date.getDay() > 31)
					{
						date.setDay(31);
					}
					break;
			// Aug
			case 7: if (date.getDay() > 31)
					{
						date.setDay(31);
					}
					break;
			// Sep
			case 8: if (date.getDay() > 30)
					{
						date.setDay(30);
					}
					break;
			// Oct
			case 9: if (date.getDay() > 31)
					{
						date.setDay(31);
					}
					break;
			// Nov
			case 10: if (date.getDay() > 30)
					{
						date.setDay(30);
					}
					break;
			// Dec
			case 11: if (date.getDay() > 31)
					{
						date.setDay(31);
					}
					break;
		}
		return date;
	}
}
