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
//		System.out.println( "�޿��� "+(int)anuSalary+"�� �Դϴ�.");
		System.out.println("�޿��� " + (int) anuSalary + "�� �Դϴ�.");
		anuSalary = anuSalary * 0.92;
		System.out.print("�����ȣ" + " " + empno + " " + deptname + " " + empname + " " + rank + "����");
		System.out.println(" ������ ���� �ްԵ� �ݾ���" + (int) anuSalary + "�� �Դϴ�.");
		this.anuSalary = (int) anuSalary;

	}

	public void salaryDeal(String empno, String empname, String deptname, String rank, double anuSalary, double deal) {
		anuSalary = anuSalary * deal;
		System.out.print("�����ȣ" + " " + empno + " " + deptname + " " + empname + " " + rank + "����");
		System.out.println(" ���� ������ " + (int) anuSalary + "�Դϴ�.");

		this.anuSalary = anuSalary;

	}

}