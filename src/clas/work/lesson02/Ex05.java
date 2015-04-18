package clas.work.lesson02;
import java.util.Scanner;

public class Ex05 {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Программа Военкомат.");
		System.out.println("Введите пожалуйста ваш возраст:");
		int age = scan.nextInt();
		if (age < 18){
			System.out.println("Вас ждет детский сад.");
		}else if( age >= 18 && age <= 65 ){
			System.out.println("Вы от нас не скроетесь.");
		}else{
			System.out.println("Проследуйте на пенсию.");
		}
	}
}