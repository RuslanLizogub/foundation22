package HomeWorkLevel01;

import java.util.Scanner;

/* �����������: ruslan_lizogub
 * ���: 100
 * ��� �������: 
 * �������� ����������: "�����"
 * �������:  ������������ ������ ����������� �����, ������� � ������� ������� �������������� ��� ����
   ������:
   1600061
   2"
 * */
public class Ex01_06Numbers {
	public static void main(String [] args){
		Scanner scan = new Scanner(System.in);
		int count, sum = 0;
		for (count = 0; scan.hasNextInt(); count++) {
		    sum += scan.nextInt();
		}
		System.out.println("Result: " + (sum / count));
    }
}