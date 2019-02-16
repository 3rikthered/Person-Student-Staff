package nelsonTask1;

import nelsonTask1.dateTest.MyDate;

public class Employee extends Person {

	private String office;
	private double salary;
	private MyDate dateHired;
	
	public Employee()
	{
	}
	
	public Employee(String office, double salary, MyDate dateHired)
	{
		this.office = office;
		this.salary = salary;
		this.dateHired = dateHired;
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
		this.dateHired = dateHired;
	}
	
	
	
}
