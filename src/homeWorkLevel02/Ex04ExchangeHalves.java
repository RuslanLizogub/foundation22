package homeWorkLevel02;

import java.util.Arrays;

/* Исполнитель: ruslan_lizogub
 * Бал: 100
 * Название упражнения: "Обмен большего и меньшего"
 * Условие: Написать метод меняющий местами половины массива, если размер нечетный - центральный элемент не учитывается
   В случае, если размер вектора некорректный, выводить сообщение "Неверный размер вектора", иначе выводить массив в красивом формате [1, 2, 3]
   Метод: void swapHalves(int[] vector)
   Пример:
   swapHalves(int[] vector); // [1234567]
   [5, 6, 7, 4, 1, 2, 3]
 * */
public class Ex04ExchangeHalves {
	public static void main(String[] args) {
		int[] vector = {1,2,5,3,4};
		
		swapHalves(vector);
		
    }
	
	public static void swapHalves(int[] vector){
		int lengthVec = vector.length;
		if (lengthVec < 1){
			System.out.println("Неверный размер вектора");
			return;
		}
		
		int indexElement = lengthVec / 2;
		
		int buferVariable;
		
		for (int i = 0; i < indexElement; i++){
			buferVariable = vector[i];
			vector[i] = vector[i + indexElement + lengthVec%2];
			vector[i + indexElement + lengthVec%2] = buferVariable;
		}
		
		System.out.println(Arrays.toString(vector));
	}
}
