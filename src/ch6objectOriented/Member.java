package ch6objectOriented;

public class Member {
	
	private String name;
	private int age;
	
	public Member() {//생성자(Constructor): 대문자
		System.out.println("Member 생성자1이 호출되었습니다.");
	}
	public Member(String name) {//생성자 오버로딩
		System.out.println("Member 생성자2가 호출되었습니다.");
	}
	public Member(int age) {
		System.out.println("Member 생성자3이 호출되었습니다.");
	}
	public Member(String name, int age) {
		System.out.println("Member 생성자4가 호출되었습니다.");
	}
	

	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

	public static void main(String[] args) {
		Member m1 = new Member();//위의 public Member()와 같음
		Member m2 = new Member("홍");
		Member m3 = new Member(23);
		Member m4 = new Member("박",34);
	}

}
