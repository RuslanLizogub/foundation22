package home.work.level01;

import java.util.Scanner;

/* �����������: ruslan_lizogub
 * ���: 100
 * ��� �������: 8jCTPUSdQDvUP2k9nxXPn7dEjlM=
 * �������� ����������: "������"
 * �������:  ������������ ������ �����, ���� ����� ������, �� ������� �� ����� "������",
   ���� ����� �� ������, ������� �� ����� "��������".
   ������:
   5
   ��������"
 * */
public class Ex01_04Even {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int val = scan.nextInt();
		System.out.println(val);
		if (val%2 == 0){
			System.out.println("������");
		}else{
			System.out.println("��������");
		}
    }
}
