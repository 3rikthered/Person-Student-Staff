package nelsonTask1;

public class Student extends Person {

	private final String classStatus;
	
	public Student(String classStatus)
	{
		this.classStatus = classStatus;
	}
	
	// GETTERS
	public String getClassStatus()
	{
		return classStatus;
	}
	
}
