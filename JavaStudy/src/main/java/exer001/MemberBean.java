package exer001;

public class MemberBean {
	
	// ��� ���� - DB �÷���� ����
	// ��� ������ private ����
	private int no;	
	private String name;
	private String job;
	private String phone_number;
	
	// �⺻ �����ڸ� ������ �־�� ��
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
