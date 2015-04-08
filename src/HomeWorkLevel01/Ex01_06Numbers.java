package HomeWorkLevel01;

import java.util.Scanner;

/* Исполнитель: ruslan_lizogub
 * Бал: 100
 * Код решения: TVgqEO5nSqvbL4O8LeXSUqEU5Ww=
 * Название упражнения: "Цифры"
 * Условие:  Пользователь вводит семизначное число, вывести в консоль среднее арифметическое его цифр
   Пример:
   1600061
   2"
 * */
public class Ex01_06Numbers {
	public static void main(String [] args){
		Scanner scan = new Scanner(System.in);
		int chislo = scan.nextInt();
		int summ = 0;
		int i;
		for ( i = 0; chislo > 0; i++) {
		    summ += chislo % 10; // summ = summ + chislo % 10;
		    chislo/=10; // chislo = chislo/10;
		}
		System.out.println(summ / i);
    }
}
