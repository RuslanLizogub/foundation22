package HomeWorkLevel01;

import java.util.Scanner;

/* Исполнитель: ruslan_lizogub
 * Бал: 100
 * Код решения: du6n5Um2xQIo+7hjmQG0iGe3yb0=
 * Название упражнения: "Четверть"
 * Условие:  Пользователь вводит координаты точки, определить в какой она находится четверти (декартова система координат)
   Если точка находится между четвертями, то выводить 0
   Пример:
   -2 2
   2
 * */
public class Ex01_11Quarter {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		Scanner scan2 = new Scanner(System.in);
		int y = scan.nextInt();
		if (x>0 && y>0){
			System.out.print(x + " ");
			System.out.println(y);
			System.out.println("1");
		}else if(x<0 && y>0){
			System.out.print(x + " ");
			System.out.println(y);
			System.out.println("2");
		}else if(x<0 && y<0){
			System.out.print(x + " ");
			System.out.println(y);
			System.out.println("3");
		}else if(x>0 && y<0){
			System.out.print(x + " ");
			System.out.println(y);
			System.out.println("4");
		}else{
			System.out.print(x + " ");
			System.out.println(y);
			System.out.println("0");
		}
    }
}
