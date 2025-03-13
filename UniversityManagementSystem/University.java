package UniversityManagementSystem;

public class University{
	private String uniName;
	private String directorName;
	private String uniAddress;
	private Department[] departments;

	public University(String uniName, String directorName, String uniAddress){
		this.uniName= uniName;
		this.directorName = directorName;
		this.uniAddress= uniAddress;
		this.departments= new Department[3];

		departments[0]= new Department("Computer Science", "Sir Shahid Bhatti");
		departments[1]= new Department("Software Engineering", "Sir Abdul Karim Shahid");
		departments[2]= new Department("Artificial Intelligence", "Ms. Muntaha Iqbal");
	}

	public void displayUniversity(){
		System.out.println("University: " + uniName);
		System.out.println("Director: " + directorName);
		System.out.println("Address: " + uniAddress);
		for(Department dept:departments){
			dept.displayDepartment();
		}
	}

}