package chapter1.sec01;

public class Employee {
	String empno;
	String empname;
	String deptname;
	String rank;
	int age;
	String gender;
	double anuSalary;
	String telno;
	String address;
	double deal;

	public double getWage() {
		return anuSalary;
	}

	public void setWage(String empno, String empname, String deptname, String rank, double anuSalary) {
		anuSalary = anuSalary / 12;
//		System.out.println( "급여는 "+(int)anuSalary+"원 입니다.");
		System.out.println("급여는 " + (int) anuSalary + "원 입니다.");
		anuSalary = anuSalary * 0.92;
		System.out.print("사원번호" + " " + empno + " " + deptname + " " + empname + " " + rank + "님이");
		System.out.println(" 세금을 제외 받게될 금액은" + (int) anuSalary + "원 입니다.");
		this.anuSalary = (int) anuSalary;

	}

	public void salaryDeal(String empno, String empname, String deptname, String rank, double anuSalary, double deal) {
		anuSalary = anuSalary * deal;
		System.out.print("사원번호" + " " + empno + " " + deptname + " " + empname + " " + rank + "님의");
		System.out.println(" 연봉 협상결과 " + (int) anuSalary + "입니다.");

		this.anuSalary = anuSalary;

	}

}
