package ClassWorkLesson04;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		int first = 3;
		int second = 1;
		
		int res = add(first, second);
		System.out.println(res);
		
    }
	
	public static int add(int first, int second) {
		int sum = first + second;
		return sum;
    }
	
	public static void printSquare() {
		System.out.println("* * *");
		System.out.println("* * *");
		System.out.println("* * *");
    }
}
