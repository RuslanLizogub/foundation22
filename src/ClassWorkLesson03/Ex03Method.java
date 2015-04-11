package ClassWorkLesson03;

import java.util.Scanner;

public class Ex03Method {
	public static void main(String[] args) {
		int first = 3;
		int second = 1;
		
		add(first, second);
    }
	
	public static void add(int first, int second) {
		int sum = first + second;
		System.out.println(sum);
    }
	
	public static void printSquare() {
		System.out.println("* * *");
		System.out.println("* * *");
		System.out.println("* * *");
    }
}
