package exercise03;


//https://www.geeksforgeeks.org/how-to-print-colored-text-in-java-console/
public class StudentGradingSystem {

	public void gradeStudents(Student s1,Student s2) {
		if(s1.getPhysicsMarks()>=40&&s1.getChemistryMarks()>=40&&s1.getMathsMarks()>=40) {
			if(s1.getPhysicsMarks() + s1.getChemistryMarks() + s1.getMathsMarks()>=120&&s1.getPhysicsMarks() + s1.getChemistryMarks() + s1.getMathsMarks()<180)
			{
				System.out.println("\u001B[43m"+"Student with name "+s1.getName()+" just pass"+"\u001B[0m");
			}else if(s1.getPhysicsMarks() + s1.getChemistryMarks() + s1.getMathsMarks()>=180) {
				System.out.println("\u001B[42m"+"Student with name "+s1.getName()+" first class"+"\u001B[0m");
			}
		}else {
			System.out.println("\u001B[41m"+"Student with name "+s1.getName()+" fails!"+"\u001B[0m");
		}
		
		if(s2.getPhysicsMarks()>=40&&s2.getChemistryMarks()>=40&&s2.getMathsMarks()>40) {
			if(s2.getPhysicsMarks() + s2.getChemistryMarks() + s2.getMathsMarks()>=40&&s2.getPhysicsMarks() + s2.getChemistryMarks() + s2.getMathsMarks()<60)
			{
				System.out.println("\u001B[43m"+"Student with name "+s2.getName()+" just pass"+"\u001B[0m");
			}else if(s2.getPhysicsMarks() + s2.getChemistryMarks() + s2.getMathsMarks()>=60) {
				System.out.println("\u001B[42m"+"Student with name "+s2.getName()+" first class"+"\u001B[0m");
			}
		}else {
			System.out.println("\u001B[41m"+"Student with name "+s2.getName()+" fails!"+"\u001B[0m");
		}
	}
	public static void main(String[] args) {
		
		Student s1 = new Student(41, 41, 41, "Ram");
		Student s2 = new Student(74, 69, 39, "Sham");
		
		StudentGradingSystem sgs = new StudentGradingSystem();
		sgs.gradeStudents(s1, s2);
	}

}
