package nelsonTask1;

public class Staff extends Employee {
	
	private String title;
	
	public Staff()
	{
	}
	
	public Staff(String title)
	{
		this.title = title;
	}

	// GETTERS
	public String getTitle()
	{
		return title;
	}

	
	// SETTERS
	public void setTitle(String title)
	{
		this.title = title;
	}

}
