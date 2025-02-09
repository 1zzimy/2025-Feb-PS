// ���� 2609 �ִ������� �ּҰ���� (�����1)
package jimin;

import java.util.Scanner;

public class B2609 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		// ��Ŭ���� ȣ���� ���� ��� !
		
		// �� ���� �ִ����� ���
		int GCD = gcd(Math.max(num1, num2), Math.min(num1, num2));
		System.out.println(GCD);

		// �� ���� �ּҰ���� ���
		int LCM = (num1 * num2)/gcd(Math.max(num1, num2), Math.min(num1, num2));
		System.out.println(LCM);
		
		sc.close();
	}
	
	public static int gcd(int num1, int num2) {
		// ���� ������ ���� 0�̸� ���� ���� ��ȯ
		if(num2 == 0) return num1;
		// 0�� �ƴ϶�� 
		return gcd(num2, num1 % num2);
	}
}
