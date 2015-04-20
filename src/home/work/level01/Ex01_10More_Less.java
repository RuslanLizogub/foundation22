package home.work.level01;

import java.util.Scanner;
/* �����������: ruslan_lizogub
 * ���: 100
 * ��� �������: TSQ4OPkBDw/gZYllzzj2SGrxhX4=
 * �������� ����������: "������� �������"
 * �������:  ������������ ������ ��� �����, ������� �� ����� ������� � ������� �� ��� � �������
   ������:
   5
   2
   5
   5 2
 * */
public class Ex01_10More_Less {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int val = scan.nextInt();
		Scanner scan2 = new Scanner(System.in);
		int val2 = scan.nextInt();
		Scanner scan3 = new Scanner(System.in);
		int val3 = scan.nextInt();
		int buf;
		// val < val2 < val3
		if(val > val2){
			buf = val;
			val = val2;
			val2 = buf;
		}
		if(val > val3){
			buf = val;
			val = val3;
			val3 = buf;
		}
		if(val2 > val3){
			buf = val2;
			val2 = val3;
			val3 = buf;
		}
		System.out.println(val3 + " " + val);
    }
}

// val < val2 < val3