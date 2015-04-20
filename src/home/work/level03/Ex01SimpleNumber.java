package home.work.level03;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

/*
 * Написать метод вычисляющий количество простых чисел в файле. Числа представлены числовой строкой.
 */
public class Ex01SimpleNumber {
	public static void main(String[] args) throws Exception {
		  Scanner scan = new Scanner(System.in);
		  final String fileName = scan.nextLine();
		  countSimpleNumber(fileName);  
	}
	
	public static void  countSimpleNumber (String fileName) throws Exception{
		Scanner fileScan = new Scanner(new File(fileName));
		ArrayList<String> list = new ArrayList<String>();
		while (fileScan.hasNext()) {
			list.add (fileScan.next());
		}
		fileScan.close();
		int size = list.size();
		System.out.println(list);
		System.out.println(size);
		
		int counter = 0;
		for(int i = 0; i < size - 1; i++){
			int numbVec = Integer.parseInt(list.get(i));
			if (isPrime(numbVec) == true){
				counter++;
			}
		}
		System.out.println(counter);
    }
	
	public static boolean isPrime(int number) {
		boolean res = true;
		for (int i = 2; i < number; i++) {  
			if (number % i == 0) {
				res = false;
			}
		}  
		return res;
	}
}
