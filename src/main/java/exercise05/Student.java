package exercise05;

public class Student {
	
	int physicsMarks,chemistryMarks,mathsMarks;
	String name;

	
	public Student(int physicsMarks, int chemistryMarks, int mathsMarks, String name) {
		super();
		this.physicsMarks = physicsMarks;
		this.chemistryMarks = chemistryMarks;
		this.mathsMarks = mathsMarks;
		this.name = name;
	}

	public int getPhysicsMarks() {
		return physicsMarks;
	}

	public int getChemistryMarks() {
		return chemistryMarks;
	}

	public int getMathsMarks() {
		return mathsMarks;
	}
	
	public String getName() {
		return name;
	}

}
