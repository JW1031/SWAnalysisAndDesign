package person;

public class SchoolMember {
	private int schoolNumber;
	private String name;
	private String phoneNumber;
	private String email;
	private String gender;
	
	public SchoolMember(int sn, String n, String p, String e, String g) {
		this.schoolNumber = sn;
		this.name = n;
		this.phoneNumber = p;
		this.email = e;
		this.gender = g;
	}
	
	public int getSchoolNumber() { return this.schoolNumber; }
	public String getName() { return this.name; }
	public String getPhoneNumber() { return this.phoneNumber; };
	public String getEmail() { return this.email; }
	public String getGender() { return this.gender; }
}
