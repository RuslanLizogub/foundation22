package HomeWorkLevel01;

import java.util.Scanner;

/* Исполнитель: ruslan_lizogub
 * Бал: 100
 * Код решения: vgPxkMPzfe3mqz3aQ1S2GhQXHVU=
 * Название упражнения: "Приветствие"
 * Условие:  Пользователь вводит своё имя с клавиатуры, поприветствовать (Hello ) пользователя по имени.
   Пример:
   Введите ваше имя:
   William Nelson Joy
   Hello William Nelson Joy"
 * */
public class Ex01_03Greeting {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Введите ваше имя:");
		String name = scan.nextLine();
		System.out.println("Hello " + name);
    }
}
