package clas.work.lesson03;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int val = scan.nextInt();
		System.out.println(Integer.toBinaryString(val));
		/*
		Scanner scan = new Scanner(System.in);
		int number = scan.nextInt();
		while(number % 2 != 0 || number / 2 != 0){
			System.out.print(number % 2);
			number = number / 2;
		}
		*/
    }
}