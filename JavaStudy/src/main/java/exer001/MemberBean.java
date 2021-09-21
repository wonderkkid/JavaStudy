package exer001;

public class MemberBean {
	
	// 멤버 변수 - DB 컬럼명과 매핑
	// 멤버 변수는 private 선언
	private int no;	
	private String name;
	private String job;
	private String phone_number;
	
	// 기본 생성자를 가지고 있어야 함
	public MemberBean() {
		this.no = 0;
		this.name = "";
		this.job = "";
		this.phone_number = "";
	}
	
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public String getPhone_number() {
		return phone_number;
	}
	public void setPhone_number(String phone_number) {
		this.phone_number = phone_number;
	}	
}
