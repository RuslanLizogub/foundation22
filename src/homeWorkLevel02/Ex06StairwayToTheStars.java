package homeWorkLevel02;

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
		String star = "*";
		String[] drawStarArray = new String[stars];
		for (int i = 0; i < stars; i++){
			drawStarArray[i] = star;
			for (int a = 0; a < stars; a++){
				System.out.print(drawStarArray[a]);
			}
		}
	}
}
