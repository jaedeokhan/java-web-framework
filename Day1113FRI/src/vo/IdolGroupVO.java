package vo;

public class IdolGroupVO {
	
	private String name; // ½Äº°ÀÚ, PK
	private String album;
	private int age;
	private int memberNumber;
	private String company;
	private String gender;
	private int year;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAlbum() {
		return album;
	}
	public void setAlbum(String album) {
		this.album = album;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getMemberNumber() {
		return memberNumber;
	}
	public void setMemberNumber(int memberNumber) {
		this.memberNumber = memberNumber;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	
	@Override
	public String toString() {
		return "IdolGroupVO [name=" + name + ", album=" + album + ", age=" + age + ", memberNumber=" + memberNumber
				+ ", company=" + company + ", gender=" + gender + ", year=" + year + "]";
	}

	
}
