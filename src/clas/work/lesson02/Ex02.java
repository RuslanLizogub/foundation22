package clas.work.lesson02;
import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Введите число:");
		int val = scan.nextInt();
		System.out.println("Случайное число из указанного диапазона: " + Math.round(Math.random() * val));
	}
}
