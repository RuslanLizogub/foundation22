package home.work.level02;

import java.util.Arrays;
/* Исполнитель: ruslan_lizogub
 * Название упражнения: "Лестница к звёздам"
 * Условие: Написать класс с методом рисующий лесенку из звездочек, высота равна ширине, и передается в метод в качестве параметра. например:
   В случае, если значение высоты имеет неправильное значение, выводить сообщение, например: Неверное значение высоты
   Метод: void drawStair(int height)
   Пример:
   drawStair(4)
   *
   **
   ***
   ****
 * */
public class Ex06StairwayToTheStars {
	public static void main(String[] args) {
		int draw = 4;

		drawStair(draw);
    }
	
	public static void drawStair(int stars){
		if(stars <= 0){
			System.out.println("Неверное значение высоты");
			return;
		}
		String star = "*";
		for (int i = 0; i < stars; i++){
			System.out.println(star);
			star = star + "*";
		}
	}
}
