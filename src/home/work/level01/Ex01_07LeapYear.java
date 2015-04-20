package home.work.level01;

import java.util.Scanner;

/* �����������: ruslan_lizogub
 * ���: 100
 * ��� �������: g5PlQDsx9sZjqWFS0plP0d+HtG8=
 * �������� ����������: "���������� ���"
 * �������:  ������������ ������ ���, ���������� �������� �� �� ����������
 (��� �������� ���������� � ���� �������: ���� �� ������ 4, �� ��� ���� �� ������ 100, ���� ������ 400)
 ������:
 2014
 ������������
 * */
public class Ex01_07LeapYear {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int val = scan.nextInt();
		if (val % 400 == 0) {
			System.out.println(val);
			System.out.println("����������");
			return;
		}
		if (val % 100 == 0) {
			System.out.println(val);
			System.out.println("������������");
			return;
		}
		if (val % 4 == 0) {
			System.out.println(val);
			System.out.println("����������");
			return;
		}else{
			System.out.println(val);
			System.out.println("������������");
		}
	}
}