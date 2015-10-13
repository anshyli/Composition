public class School {
	String name = "";
	String address = "";
	String[] schoolType = {"PhD", "MS", "BS", "HS" , "MID", "ELM"};

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String[] getSchoolType() {
		return schoolType;
	}
	public void setSchoolType(String[] schoolType) {
		this.schoolType = schoolType;
	}

}
