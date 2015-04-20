package home.work.level02;

import java.util.Arrays;

/* Исполнитель: ruslan_lizogub
 * Бал: 100
 * Название упражнения: "Сумма нечетных"
 * Условие: Написать метод возвращающий количество нечетных элементов массива
   В случае, если размер вектора некорректный, выводить сообщение "Неверный размер вектора"
   Метод: int calcNonPairCount(int[] vector)
   Пример:
   calcNonPairCount(int[] vector); // [1234567]
   4
 * */
public class Ex02AmountOdd {
	public static void main(String[] args) {
		int[] vector = {1,2,1};
		
		int test = calcNonPairCount(vector);
		
		System.out.println(test);
    }
	
	public static int calcNonPairCount(int[] vec){
		int lengthVec = vec.length;
		if (lengthVec < 1){
			System.out.println("Неверный размер вектора");
		}
		
		int number = 0;
		for (int i = 0; i < lengthVec; i++){
			if(vec[i]%2 != 0){
				number = number + 1;
			}
		}
		return number;
	}
}

