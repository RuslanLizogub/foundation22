package HomeWorkLevel01;
/* Исполнитель: ruslan_lizogub
 * Бал: 100
 * Код решения: YBVgU3QFKPp2+sAvCJMPSM+GHwY=
 * Название упражнения: "Обмен"
 * Условие: "Объявить две переменные типа byte и float, вывести на экран (сначала byte, затем float), 
   поменять их значения местами, не используя дополнительной переменной и вывести на экран в том же порядке 
   Пример:
   20 4
   4 20"
 * */
public class Ex01_02Exchange {
	public static void main(String[] args) {
		byte valbyte = 10;
		float valfloat = 20;
		System.out.println(valbyte + " " + valfloat);
		System.out.println(valfloat + " " + valbyte);
    }
}