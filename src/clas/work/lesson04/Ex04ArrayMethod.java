package clas.work.lesson04;

import java.util.Arrays;
import java.util.Scanner;

public class Ex04ArrayMethod {
	public static void main(String[] args) {
		int[] array = new int [9];
		
		randomArray(array);
		System.out.println(Arrays.toString(array));
    }
	 
	public static void  randomArray (int[] array){
		int length = array.length;
		
		for (int i = 0; i < length; i++){
			array[i] = (int) (Math.random()*10);
		}
    }
}

