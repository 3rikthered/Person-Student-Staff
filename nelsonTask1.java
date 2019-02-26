package nelsonTask1;

public class nelsonTask1
{
	public static void main(String[] args)
	{
		// Creating several test dates to choose from, to show that the changes to the MyDate class are functional
		MyDate today = new MyDate();
		MyDate impossibleDay1 = new MyDate(2010, 3, 33);
		MyDate impossibleDay2 = new MyDate(1988, -4, -50);
		MyDate futureDay = new MyDate (2112, 2, 28);
		MyDate oldHire = new MyDate(1976, 7, 4);
		MyDate leapYear = new MyDate(2000, 1, 29);
		MyDate nonLeapYear = new MyDate(2001, 1, 29);
		
		// Creating test cases for each class
		Person rincewind = new Person("Rincewind", "Everywhere", "555-0001", "rincewind@uu.edu");
		Student smith = new Student("Eskarina Smith", "123 street, Ankh Morpork", "555-0002", "esmith@uu.edu", "Freshman");
		Employee hix = new Employee("John Hix", "Unseen University, room 1", "555-0003", "jhix@uu.edu", "Post-Mortem Communication", 9999999, oldHire);
		Staff stibbons = new Staff("Ponder Stibbons", "Unseen University, room 2", "555-0004", "pstibbons@uu.edu", "Master of Traditions", 30000, futureDay, "Camerlengo");
		Faculty worblehat = new Faculty("Horace Worblehat", "Unseen University, room 3", "555-0005", "ook@uu.edu", "Librarian", 75000, impossibleDay1, "9 - 5", 2);

		// Printouts of test cases
		System.out.println("\n" + personData(rincewind));
		System.out.println("\n" + studentData(smith));
		System.out.println("\n" + employeeData(hix));
		System.out.println("\n" + staffData(stibbons));
		System.out.println("\n" + facultyData(worblehat));
		
		// Testing setters
		worblehat.setName("Ook ook");
		System.out.println("\n" + facultyData(worblehat));
		
		MyDate testDay = new MyDate(2020, 12, 22);

		stibbons.setDateHired(testDay);
		System.out.println("\n" + staffData(stibbons));
	}
	
	
	
	// method to print out the date
	public static String dateInfo(MyDate date)
	{
		String datePrintout = (date.getYear() + " " + date.getMonth() + " " + date.getDay());
		return datePrintout;
	}
	
	
	// The following methods generate a printout of a person's data
	public static String personData(Person person)
	{
		String personBio = ("PERSON\nName:		" 	+ person.getName() +
							"\nAddress:	" 			+ person.getAddress() +
							"\nPhone:		" 		+ person.getPhoneNumber() +
							"\nEmail:		" 		+ person.getEmailAddress());
		return  personBio;
	}
	
	public static String studentData(Student student)
	{
		String studentBio = ("STUDENT\nName:		" 	+ student.getName() +
							"\nAddress:	" 			+ student.getAddress() +
							"\nPhone:		" 		+ student.getPhoneNumber() +
							"\nEmail:		" 		+ student.getEmailAddress() +
							"\nClass Status:	"	+ student.getClassStatus());
		return  studentBio;
	}
	
	public static String employeeData(Employee employee)
	{
		String employeeBio = ("EMPLOYEE\nName:		" + employee.getName() +
						 	"\nAddress:	"	 		+ employee.getAddress() +
							"\nPhone:		" 		+ employee.getPhoneNumber() +
							"\nEmail:		" 		+ employee.getEmailAddress() +
							"\nOffice:		" 		+ employee.getOffice() +
							"\nSalary:		" 		+ employee.getSalary() +
							"\nDate Hired:	" 		+ dateInfo(employee.getDateHired()));
		return  employeeBio;
	}
	
	public static String staffData(Staff staff)
	{
		String staffBio = ("STAFF\nName:		" 	+ staff.getName() +
							"\nAddress:	" 			+ staff.getAddress() +
							"\nPhone:		" 		+ staff.getPhoneNumber() +
							"\nEmail:		" 		+ staff.getEmailAddress() +
							"\nOffice:		" 		+ staff.getOffice() +
							"\nSalary:		" 		+ staff.getSalary() +
							"\nDate Hired:	" 		+ dateInfo(staff.getDateHired()) +
							"\nTitle:		"		+ staff.getTitle());
		return  staffBio;
	}
	
	public static String facultyData(Faculty faculty)
	{
		String facultyBio = ("FACULTY\nName:		" + faculty.getName() +
						 	"\nAddress:	" 			+ faculty.getAddress() +
							"\nPhone:		" 		+ faculty.getPhoneNumber() +
							"\nEmail:		" 		+ faculty.getEmailAddress() +
							"\nOffice:		" 		+ faculty.getOffice() +
							"\nSalary:		" 		+ faculty.getSalary() +
							"\nDate Hired:	" 		+ dateInfo(faculty.getDateHired()) +
							"\nOffice Hours:	"	+ faculty.getOfficeHours() +
							"\nRank:		"		+ faculty.getRank());
		return  facultyBio;
	}
}
