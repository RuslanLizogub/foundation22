package ClassWorkLesson02;
import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args){
		Scanner scan2 = new Scanner(System.in);
		Scanner scan = new Scanner(System.in);
		System.out.println("Введите первое число:");
		int val = scan.nextInt();
		System.out.println("Введите второе число:");
		int val2 = scan2.nextInt();
		if (val > val2){
			System.out.println("Большее число " + val);
		}else{
			System.out.println("Большее число " + val2);
		}
	}
}
