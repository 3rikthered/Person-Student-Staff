package nelsonTask1;

public class Student extends Person {

	private final String classStatus;
	
	public Student(String name,  String address, String phoneNumber,
				   String emailAddress, String classStatus)
	{
		super(name, address, phoneNumber, emailAddress);
		
		this.classStatus = classStatus;
	}
	
	// GETTERS
	public String getClassStatus()
	{
		return classStatus;
	}
}
