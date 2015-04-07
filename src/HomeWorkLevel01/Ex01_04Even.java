package HomeWorkLevel01;

import java.util.Scanner;

/* Исполнитель: ruslan_lizogub
 * Бал: 100
 * Код решения: 8jCTPUSdQDvUP2k9nxXPn7dEjlM=
 * Название упражнения: "Четный"
 * Условие:  Пользователь вводит число, если число чётное, то вывести на экран "четное",
   если число не четное, вывести на экран "нечетное".
   Пример:
   5
   нечетное"
 * */
public class Ex01_04Even {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int val = scan.nextInt();
		System.out.println(val);
		if (val%2 == 0){
			System.out.println("четное");
		}else{
			System.out.println("нечетное");
		}
    }
}
