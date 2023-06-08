package kr.co.ddit.project1;

import java.util.Scanner;

public class unfor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Anttttt at2 = new Anttttt();
		at2.pb4();

	}

}

class Anttttt {
	public void pb1() {
//	int[] a =  new int[10];
		System.out.print("거스름돈을 입력하시오 : ");
		Scanner sc = new Scanner(System.in);
		int money = sc.nextInt();
		int[] b = { 10000, 5000, 1000, 500, 100, 50, 10 };
		int sum = 0;
//	System.out.println(b[0]);
//	System.out.println(money);
		for (int i = 0; i < b.length; i++) {
			sum = money / b[i];
			System.out.println(b[i] + "원이 " + sum + "개 필요합니다.");
			money -= sum * b[i];
		}

	}

	public void pb2() {
//		int rnd1=(int)(Math.random()*6+1);
//		int rnd2=(int)(Math.random()*6+1);
//		System.out.println(rnd1);
//		System.out.println(rnd2);

//			for (int i = 0; i < 50; i++) {
//				int rnd1=(int)(Math.random()*6+1);
//				System.out.print("1번 주사위 값 ="+rnd1+" ");
//				
//				System.out.print((i+1)+": ");
//				for (int j = 0; j <= rnd1-1; j++) {
//					System.out.print("*");
//				}
//				System.out.println();
//			}
	}

	public void pb3() {

		int[] dice = new int[50];

		for (int i = 0; i < 50; i++) {
			int rnd = (int) (Math.random() * 6 + 1);
			dice[i] = rnd;
//			System.out.println(i+""+dice[i]);
		}

		for (int j = 1; j < 7; j++) {
			System.out.print(j + "  ");
			int cnt = 0;
			for (int z = 0; z < 50; z++) {
				if (dice[z] == j) {
					System.out.print("*");
					cnt++;
				}
			}
			System.out.print(" " + "(" + cnt + ")");
			System.out.println();
		}

	}

	public void pb4() {
		Scanner sc = new Scanner(System.in);

		int[] a = new int[10];

//		System.out.print("정수 10개를 입력해주세요! :");
		for (int i = 0; i < 10; i++) {
			System.out.print("정수 10개를 입력해주세요! :");
			a[i] = sc.nextInt();
		}
		int x = a[0];
		int y = a[0];

		for (int i = 0; i < 10; i++) {
			System.out.print("[" + a[i] + "]" + "  ");
			if (x < a[i]) {
				x = a[i];
			}
			if (y > a[i]) {
				y = a[i];
			}
		}
		System.out.println();
		System.out.println("10개의 정수중에 가장 큰 수는 " + x + "이다.");
		System.out.println("10개의 정수중에 가장 작은 수는 " + y + "이다.");
	}
}
