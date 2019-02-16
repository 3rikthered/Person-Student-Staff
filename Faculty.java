package nelsonTask1;

public class Faculty extends Employee{
	
	private String officeHours;
	private int rank;
	
	public Faculty()
	{
	}
	
	public Faculty(String officeHours, int rank)
	{
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
