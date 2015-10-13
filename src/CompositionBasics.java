public class CompositionBasics {

	public static void main(String[] args) {
		Person bobby = new Person();
		bobby.getEducation().setTopEduLevel("MS");
		bobby.getCurrentJob().setSalary(10000.0);
		System.out.println("Bobby's highest education level is: " + bobby.getEducation().getTopEduLevel());
		System.out.println("His current salary is: " + bobby.getCurrentJob().getSalary());
	}

}
