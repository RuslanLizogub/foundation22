package HomeWorkLevel01;

import java.util.Scanner;

/* Исполнитель: ruslan_lizogub
 * Бал: 100
 * Код решения: 
 * Название упражнения: "Цифры"
 * Условие:  Пользователь вводит семизначное число, вывести в консоль среднее арифметическое его цифр
   Пример:
   1600061
   2"
 * */
public class Ex01_06Numbers {
	public static void main(String [] args){
		Scanner scan = new Scanner(System.in);
		int count, sum = 0;
		for (count = 0; scan.hasNextInt(); count++) {
		    sum += scan.nextInt();
		}
		System.out.println("Result: " + (sum / count));
    }
}