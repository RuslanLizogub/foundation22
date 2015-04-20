package home.work.level01;

import java.util.Scanner;

/* �����������: ruslan_lizogub
 * ���: 100
 * ��� �������: vgPxkMPzfe3mqz3aQ1S2GhQXHVU=
 * �������� ����������: "�����������"
 * �������:  ������������ ������ ��� ��� � ����������, ���������������� (Hello ) ������������ �� �����.
   ������:
   ������� ���� ���:
   William Nelson Joy
   Hello William Nelson Joy"
 * */
public class Ex01_03Greeting {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("������� ���� ���:");
		String name = scan.nextLine();
		System.out.println("Hello " + name);
    }
}
