import java.util.ArrayList;
import java.util.Iterator;

public class Education {
	private ArrayList<School> schools = new ArrayList<School>();
	private String topEduLevel;   //contains schoolType value from School class
	
	public Education () {
		School school1 = new School();
		school1.name = "aaaDaycare";
		schools.add(school1);
		
	}

	public String getTopEduLevel() {
		return topEduLevel;
	}

	public void setTopEduLevel(String topEduLevel) {
		this.topEduLevel = topEduLevel;
	}

	public ArrayList<School> getSchools() {
		return schools;
	}

	public void setSchools(ArrayList<School> schools) {
		this.schools = schools;
	}

	@Override
	public String toString() {
		String out = "The schools attended: \n";
//		for (int i = 0; i < schools.length; i++) {
//			out = out + schools[i].name;
//		}
        Iterator<School> iterator = schools.iterator();
        while (iterator.hasNext()) {
            out = out + iterator.next();
        }
		return out;
	}
}
