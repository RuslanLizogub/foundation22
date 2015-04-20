package HomeWorkLevel01;

import java.util.Scanner;

/* Исполнитель: ruslan_lizogub
 * Бал: 100
 * Код решения: whN4HunuZs6G7h2RMXWr9NHXPH8=
 * Название упражнения: "Квадратное уравнение"
 * Условие:  Пользователь вводит коэффициенты квадратного уравнения.
   Вывести на экран корни уравнения.
   Если первый коэффициент равен нулю, то вывести "Первый коэффициент не может быть 0".
   Если уравнение не имеет корней, то вывести "Нет действительных решений уравнения".
   Если уравнение имеет два решения, то вывести их в строку через пробел
   Пример:
   1
   3
   -4
   1 -4
 * */
public class Ex01_08Quadratic_Equation {
	public static void main(String [] args){
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		if (a == 0) {
			System.out.println(a);
			System.out.println("Первый коэффициент не может быть 0");
			return;
		}
		Scanner scan2 = new Scanner(System.in);
		int b = scan.nextInt();
		Scanner scan3 = new Scanner(System.in);
		int c = scan.nextInt();
		int d = b*b-4*a*c;
		
		if(d<0){
			System.out.println(a);
			System.out.println(b);
		    System.out.println(c);
			System.out.println("Нет действительных решений уравнения");
		}else{
			if (d == 0)
			{
				 int x = -b/(2*a);
				 System.out.println(a);
				 System.out.println(b);
				 System.out.println(c);
				 System.out.println(x);
			}
			else
			{
				double x1 = (-b + Math.sqrt(d))/(2*a);
		        double x2 = (-b - Math.sqrt(d))/(2*a);
		        System.out.println(a);
				System.out.println(b);
				System.out.println(c);
		        System.out.print(x1 + " ");
		        System.out.println(x2);
			}
		}	
    }
}