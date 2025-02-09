// ���� 1546 ��� (�����1)

package jimin;

import java.util.Scanner;

public class B1546 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// ���� ���� ����
		int N = sc.nextInt();
		// ���� ����ŭ ������ ������ �迭 ����
		int[] nums = new int[N];
		
		// �ִ밪 ������ ���� ����
		int max = Integer.MIN_VALUE;
		// ���ο� ��� ���ϱ� ���� sum ���� ����
		double sum = 0;
		
		// ���� ������ �迭�� ���
		for(int i=0; i<N; i++) {
			nums[i] = sc.nextInt();

			// ���� ���� ���� ������ �ִ밪���� ���� ���
			if(max < nums[i]) {
				max = nums[i];
			}
		}

		// ���� / �ִ밪 * 100 �� sum�� ���ϱ�
		for(int i=0; i<N; i++) {
			sum += (double) nums[i] / max * 100;
		}
		
		System.out.println(sum/N);
		sc.close();
	}
}
