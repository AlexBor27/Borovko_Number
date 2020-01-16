package number;

import java.util.Scanner;

/*****************************************************
 * Составить алгоритм : если введеное число больше 7,*
 *  то вывести "Привет"								 *
 *****************************************************/

public class Number {

	private static double value = 7.0;

	public static void func(String s) {

		try {
			double var = Double.parseDouble(s);
			if (var > value) {
				System.out.print("Привет");
			}
		} catch (NumberFormatException e) {
			System.out.print("Значение не является числом, перезапустите программу");
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.print("Введите любое число и нажмите 'Enter' ");
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		func(str);
		scan.close();
	}

}
