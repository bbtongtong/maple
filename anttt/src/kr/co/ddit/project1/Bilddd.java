package kr.co.ddit.project1;

import java.util.Scanner;

public class Bilddd {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] a = new int[10];
		
//		System.out.print("정수 10개를 입력해주세요! :");
		for(int i=0; i<10; i++) {
			System.out.print("정수 10개를 입력해주세요! :");
		a[i]= sc.nextInt();
		}
		int x = a[0];
		int y = a[0];
		
		for(int i=0; i<10; i++) {
		System.out.print("["+a[i]+"]"+"  ");
			if(x<a[i]) {
				x=a[i];
			}
			if(y>a[i]) {
				y=a[i];
			}
		}
		System.out.println();
		System.out.println("10개의 정수중에 가장 큰 수는 "+x+"이다.");
		System.out.println("10개의 정수중에 가장 작은 수는 "+y+"이다.");
		
		
	}

}
