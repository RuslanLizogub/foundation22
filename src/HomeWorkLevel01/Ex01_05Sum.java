package HomeWorkLevel01;

import java.util.Scanner;

/* Исполнитель: ruslan_lizogub
 * Бал: 100
 * Код решения: /YOLz/+1PsC7IFb5d0kQWqjd7NY=
 * Название упражнения: "Сумма"
 * Условие:  Пользователь вводит два числа, вычислить их сумму и вывести на экран
   Пример:
   5
   12
   17"
 * */
public class Ex01_05Sum {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int val = scan.nextInt();
		Scanner scan2 = new Scanner(System.in);
		int val2 = scan.nextInt();
		System.out.println(val);
		System.out.println(val2);
		System.out.println(val + val2);
    }
}