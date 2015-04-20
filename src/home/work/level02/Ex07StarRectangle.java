package homeWorkLevel02;

import java.util.Arrays;
/* Исполнитель: ruslan_lizogub
 * Название упражнения: "Звёздный прямоугольник"
 * Условие: Написать класс с методом рисующим закрашенный прямоугольник из звездочек, высота и ширина передаются методу в качестве параметра
   В случае, если какой то параметр имеет неправильное значение, выводить сообщение, например: Неверное значение ширины.
   Метод: void drawRectangle(int height, int width)
   Пример:
   drawRectangle(3, 4)
   ****
   ****
   ****
 * */
public class Ex07StarRectangle {
	public static void main(String[] args) {
		int height = 5;
		int width = 6;
		drawRectangle(height,width);
    }
	
	public static void drawRectangle(int height, int width){
		if(width <= 0){
			System.out.println("Неверное значение ширины");
			return;
		}
		if(height <= 0){
			System.out.println("Неверное значение высоты");
			return;
		}
		
		String star = "*";
		for (int i = 1; i < width; i++){
			star = star + "*";
		}
		for (int i = 0; i < height; i++){
			System.out.println(star);
		}
	}
}
