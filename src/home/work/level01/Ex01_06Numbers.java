package home.work.level01;

import java.util.Scanner;

/* �����������: ruslan_lizogub
 * ���: 100
 * ��� �������: TVgqEO5nSqvbL4O8LeXSUqEU5Ww=
 * �������� ����������: "�����"
 * �������:  ������������ ������ ����������� �����, ������� � ������� ������� �������������� ��� ����
   ������:
   1600061
   2"
 * */
public class Ex01_06Numbers {
	public static void main(String [] args){
		Scanner scan = new Scanner(System.in);
		int chislo = scan.nextInt();
		int summ = 0;
		int i;
		for ( i = 0; chislo > 0; i++) {
		    summ += chislo % 10; // summ = summ + chislo % 10;
		    chislo/=10; // chislo = chislo/10;
		}
		System.out.println(summ / i);
    }
}
