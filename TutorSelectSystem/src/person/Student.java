package person;

public class Student extends SchoolMember{
	private int grade;	//�г�
	private int studentID;	//�й�
	private double gradeAverage;	//���� ���
	
	
	public Student(int sn, String n, String p, String e, String g) {
		super(sn, n, p, e, g);
		// TODO Auto-generated constructor stub
	}

	public int getGrade() { return grade; }
	public int getStudentID() { return studentID; }
	public double getGradeAverage() { return gradeAverage; }
	
}
