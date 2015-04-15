package homeWorkLevel02;

import java.util.Scanner;

/* Исполнитель: ruslan_lizogub
 * Бал: 
 * Название упражнения: "Среднее арифметическое"
 * Условие: Написать класс с методом, возвращающий среднее арифметическое значение для всех элементов массива
   В случае, если размер вектора некорректный, выводить сообщение "Неверный размер вектора"
   Метод: int calcVectorAvg(int[] vector)
   Пример:
   calcVectorAvg(int[] vector); // [1234567]
   14
 * */
public class Ex03Average {
	public static void main(String[] args) {
		int[] vector = {1,5};
		
		int averageValue = calcVectorAvg(vector);
		
		System.out.println(averageValue);
    }
	
	public static int calcVectorAvg(int[] vector){
		int lengthVec = vector.length;
		if (lengthVec < 1){
			System.out.println("Неверный размер вектора");
		}else{
			int number = 0;
			for (int i = 0; i < lengthVec; i++){
					number = number + vector[i];
			}
			int averageVal = number / lengthVec;
			return averageVal;
		}
		return lengthVec;
	}
}
