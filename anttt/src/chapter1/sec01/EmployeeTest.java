package chapter1.sec01;

import java.util.Scanner;

public class EmployeeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e = new Employee();
		Scanner sc = new Scanner(System.in);
		System.out.print("������ �Է��Ͻÿ� : ");
		e.setWage("a01", "ȫ�浿", "��ȹ��", "����", sc.nextDouble());
//		double anuSalary=e.getWage();

//		Employee e1= new Employee(String empno, String empname,String deptname,String rank);
		Employee e1 = new Employee();

		System.out.print("�������� %�� �Է��ϼ��� : ");

		e1.salaryDeal("a02", "�̼���", "ȫ����", "����", 5000000, sc.nextDouble());
//		System.out.print("����..");

	}

}
