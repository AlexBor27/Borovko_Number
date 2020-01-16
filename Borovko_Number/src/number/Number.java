package number;

import java.util.Scanner;

/*****************************************************
 * ��������� �������� : ���� �������� ����� ������ 7,*
 *  �� ������� "������"								 *
 *****************************************************/

public class Number {

	private static double value = 7.0;

	public static void func(String s) {

		try {
			double var = Double.parseDouble(s);
			if (var > value) {
				System.out.print("������");
			}
		} catch (NumberFormatException e) {
			System.out.print("�������� �� �������� ������, ������������� ���������");
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.print("������� ����� ����� � ������� 'Enter' ");
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		func(str);
		scan.close();
	}

}
