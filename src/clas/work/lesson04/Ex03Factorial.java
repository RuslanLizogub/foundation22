package clas.work.lesson04;

import java.util.Scanner;

public class Ex03Factorial {
	public static void main(String[] args) {
		int number = 3;
		
		int res = fac (number);
		System.out.println(res);
		
    }
	 
	public static int fac (int number){
		int res = 1;
		for (int i = 1; i <= number; i++ ){
			res = res * i;
		}
		return res;
    }
}

