package сlass.work.lesson05;

import java.io.File;
import java.util.Scanner;

public class Ex02firstLast {
	public static void main(String[] args) throws Exception {
		String str = "abcdd";
		firstLast(str);
	}
	
	public static void  firstLast (String strMet){
		int length = strMet.length();
		char first = strMet.charAt(0);
		char last = strMet.charAt(length-1);
		
		if(first == last){
			System.out.println("Символы одинаковые.");
		}else{
			System.out.println("Символы различные.");
		}
    }

}
