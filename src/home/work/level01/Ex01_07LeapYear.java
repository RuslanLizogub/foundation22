package HomeWorkLevel01;

import java.util.Scanner;

/* Исполнитель: ruslan_lizogub
 * Бал: 100
 * Код решения: g5PlQDsx9sZjqWFS0plP0d+HtG8=
 * Название упражнения: "Высокосный год"
 * Условие:  Пользователь вводит год, определить является ли он високосным
 (год является високосным в двух случаях: либо он кратен 4, но при этом не кратен 100, либо кратен 400)
 Пример:
 2014
 Невисокосный
 * */
public class Ex01_07LeapYear {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int val = scan.nextInt();
		if (val % 400 == 0) {
			System.out.println(val);
			System.out.println("Високосный");
			return;
		}
		if (val % 100 == 0) {
			System.out.println(val);
			System.out.println("Невисокосный");
			return;
		}
		if (val % 4 == 0) {
			System.out.println(val);
			System.out.println("Високосный");
			return;
		}else{
			System.out.println(val);
			System.out.println("Невисокосный");
		}
	}
}