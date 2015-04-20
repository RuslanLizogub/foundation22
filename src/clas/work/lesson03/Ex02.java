package ClassWorkLesson03;

import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int val = scan.nextInt();
		
		if (!scan.hasNextInt()){
			System.out.print("Вы не то вводите:)");
			return;
		}
		
		final int LENGTH = scan.nextInt();
		if(LENGTH < 1){
			System.out.print("Вы не то вводите:)");
			return;
		}
		
		int[] test = new int [val];
		int lenght = test.length;
		System.out.print("[");
		for (int i = 0; i < lenght; i++){
			test[i] = (int) (Math.random() * 9);
			if(i != lenght-1){
				System.out.print(test[i] + ",");
			}else{
				System.out.print(test[i]);
			}
		}
		System.out.print("]");
    }
}
