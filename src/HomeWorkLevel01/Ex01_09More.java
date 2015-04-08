package HomeWorkLevel01;

import java.util.Scanner;
/* Исполнитель: ruslan_lizogub
 * Бал: 100
 * Код решения: 80r10b9fmKoLPJFPkn0FCPbHji8=
 * Название упражнения: "Больший"
 * Условие:  Пользователь вводит два числа, вывести на экран большее из них. 
   Пример:
   5
   2
   5
 * */
public class Ex01_09More {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int val = scan.nextInt();
		Scanner scan2 = new Scanner(System.in);
		int val2 = scan.nextInt();
	
		if(val>val2){
			System.out.println(val);
			System.out.println(val2);
			System.out.println(val);
		}else{
			System.out.println(val);
			System.out.println(val2);
			System.out.println(val2);
		}
    }
}



/*
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	String number = scan.nextLine();
	String[] arrow_number = number.split(" ");
	String element1 = arrow_number[0];
	String element2 = arrow_number[1];
	int a = new Integer(element1);
	int b = new Integer(element2);

	if(a>b){
		System.out.println(element1);
		System.out.println(element2);
		System.out.println(element1);
	}else{
		System.out.println(element1);
		System.out.println(element2);
		System.out.println(element2);
	}
}
*/