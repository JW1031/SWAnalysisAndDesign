package tutor;

public class TutorRecord {
	public String subject;
	public double evaluation;
	
	public TutorRecord(String s, double e) {
		subject = s;
		evaluation = e;
	}
	
	public String getSubject() { return subject; }
	public double getEvaluation() { return evaluation; }
}
