package ClassWorkLesson04;

import java.util.Scanner;

public class Ex02pow {
	public static void main(String[] args) {
		int number = 5;
		int pow = 4;
		
		int res = pow (number, pow);
		System.out.println(res);
		
    }
	 
	public static int pow (int number, int pow){
		int res = number;
		for (int i = 1; i < pow; i++ ){
			res = res * number;
		}
		return res;
    }
}

