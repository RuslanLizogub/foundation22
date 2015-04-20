package home.work.level01;

import java.util.Scanner;

/* �����������: ruslan_lizogub
 * ���: 100
 * ��� �������: du6n5Um2xQIo+7hjmQG0iGe3yb0=
 * �������� ����������: "��������"
 * �������:  ������������ ������ ���������� �����, ���������� � ����� ��� ��������� �������� (��������� ������� ���������)
   ���� ����� ��������� ����� ����������, �� �������� 0
   ������:
   -2 2
   2
 * */
public class Ex01_11Quarter {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		Scanner scan2 = new Scanner(System.in);
		int y = scan.nextInt();
		if (x>0 && y>0){
			System.out.print(x + " ");
			System.out.println(y);
			System.out.println("1");
		}else if(x<0 && y>0){
			System.out.print(x + " ");
			System.out.println(y);
			System.out.println("2");
		}else if(x<0 && y<0){
			System.out.print(x + " ");
			System.out.println(y);
			System.out.println("3");
		}else if(x>0 && y<0){
			System.out.print(x + " ");
			System.out.println(y);
			System.out.println("4");
		}else{
			System.out.print(x + " ");
			System.out.println(y);
			System.out.println("0");
		}
    }
}
