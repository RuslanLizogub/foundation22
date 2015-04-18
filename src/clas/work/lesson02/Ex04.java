package clas.work.lesson02;

import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Введите число:");
		int val = scan.nextInt();
		if (val%2 == 0){
			System.out.println("Данное число является четным.");
		}else{
			System.out.println("Данное число является не четным.");
		}
	}
}
