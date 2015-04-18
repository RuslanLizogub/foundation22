package clas.work.lesson02;
import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Введите ваше имя:");
		String name = scan.nextLine();
		System.out.println("Приветствуем вас " + name + ".");
	}
}