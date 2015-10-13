public class Person {
	private String firstName;
	private String lastName;
	private int	pId;
	private String Soc;
	private String bod;  // mm/dd/yyy
	private Education education;
	private Job	currentJob;
	
	public Person() {
		this.currentJob = new Job();
		this.education = new Education();
		this.firstName = "Bobby";
		this.lastName = "Li";
		this.bod = "10/12/2000";
	}
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getpId() {
		return pId;
	}
	public void setpId(int pId) {
		this.pId = pId;
	}
	public String getSoc() {
		return Soc;
	}
	public void setSoc(String soc) {
		Soc = soc;
	}
	public String getBod() {
		return bod;
	}
	public void setBod(String bod) {
		this.bod = bod;
	}
	public Education getEducation() {
		return education;
	}
	public void setEducation(Education education) {
		this.education = education;
	}
	public Job getCurrentJob() {
		return currentJob;
	}
	public void setCurrentJob(Job currentJob) {
		this.currentJob = currentJob;
	}
	
	
}
