// ���� 1978 �Ҽ� ã�� (�����2)
package jimin;

import java.util.Scanner;

public class B1978 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// ���� ���� �Է�
		int N = sc.nextInt();
		// �Ҽ��� ���� count
		int cnt = 0;
		
		for (int i=0; i<N; i++) {
			// �� �Է¹ޱ�
			int a = sc.nextInt();
			// �Ҽ����� Ȯ��
			if(isPrime(a)) {
				cnt += 1;
			}
		}
		
		System.out.println(cnt);
		sc.close();
	}
	// �Ҽ� �Ǻ�
	public static boolean isPrime(int num) {
		if (num < 2) {
			return false;
		} else {
			for (int i=2; i<num; i++) {
				if(num % i == 0) {
					return false;
				}
			}
		}
		return true;
	}
}
