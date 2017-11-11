package person;

public class Student extends SchoolMember{
	private int grade;	//학년
	private int studentID;	//학번
	private double gradeAverage;	//학점 평균
	
	
	public Student(int sn, String n, String p, String e, String g) {
		super(sn, n, p, e, g);
		// TODO Auto-generated constructor stub
	}

	public int getGrade() { return grade; }
	public int getStudentID() { return studentID; }
	public double getGradeAverage() { return gradeAverage; }
	
}
