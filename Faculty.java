package nelsonTask1;

public class Faculty extends Employee{
	private String officeHours;
	private int rank;
	
	public Faculty(String name,  String address, String phoneNumber,
	        String emailAddress, String office, double salary,
	        MyDate dateHired, String officeHours, int rank)
	{
		super(name, address, phoneNumber, emailAddress, office, salary, dateHired);
		
		this.officeHours = officeHours;
		this.rank = rank;
	}
	
	// GETTERS
	public String getOfficeHours()
	{
		return officeHours;
	}

	public int getRank()
	{
		return rank;
	}
	
	// SETTERS
	public void setOfficeHours(String officeHours)
	{
		this.officeHours = officeHours;
	}

	public void setRank(int rank)
	{
		this.rank = rank;
	}
}
