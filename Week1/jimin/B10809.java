// ���� 10809 ���ĺ� ã�� (�����2)
package jimin;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class B10809 {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String alphabet = "abcdefghijklmnopqrstuvwxyz";

		// �ܾ� S �Է¹ޱ� (�ҹ��ڷθ� �̷����, �ܾ��� ���̴� 100�� ���� ����)
		String S = br.readLine();

		// �ܾ� ���� ����
		boolean a;
		// length() : �� ������ ���� ����
		for (int i = 0; i < alphabet.length(); i++) {
			// �ʱ�ȭ
			a = true;

			for (int j = 0; j < S.length(); j++) {
				// charAt(int index) : Ư�� ��ġ�� ���ڸ� ����
				if (alphabet.charAt(i) == S.charAt(j)) {
					System.out.print(j + " ");
					a = false;
					break;
				}
			}
			// ���� �ܾ ���ԵǾ� ���� �ʴٸ�,
			if (a) {
				System.out.print(-1 + " ");
			}
		}
		// indexOf(String str) : ���ڿ� ������ �־��� ���ڿ��� ��ġ�� ����
	}
}
