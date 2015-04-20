package homeWorkLevel02;

import java.util.Arrays;

/* Исполнитель: ruslan_lizogub
 * Бал: 100
 * Название упражнения: "Обмен большего и меньшего"
 * Условие: "Написать метод, меняющий местами первые найденные наибольший и наименьший элементы вектора.
   В случае, если размер вектора некорректный, выводить сообщение "Неверный размер вектора"
   Название метода: swapMaxMinVector
   Пример:
   swapMaxMinVector(int[] vector); // [4,4,3,3,1,1]
   [1,4,3,3,4,1]"
 * */
public class Ex01ExchangeOfLargerAndSmaller {
	public static void main(String[] args) {
		int[] vector = {6,5,2,5};
		
		swapMaxMinVector(vector);
    }
	
	public static  void swapMaxMinVector(int[] vec){
		int lengthVec = vec.length;
		if (lengthVec < 1){
			System.out.println("Неверный размер вектора");
		}
		
		int maximumIndex = -1;
		int maxInt = -2147483648;
		for (int i = 0; i < lengthVec; i++){
			if(vec[i] > maxInt){
				maxInt = vec[i];
				maximumIndex = i; // Указывает на индекс первого максимального числа массива.
			}
		}
		
		int minimumIndex = -1;
		int minInt = 2147483647;
		for (int i = 0; i < lengthVec; i++){
			if(vec[i] < minInt){
				minInt = vec[i];
				minimumIndex = i; // Указывает на индекс первого минимального числа массива.
			}
		}
		
		int buferVariable = vec [maximumIndex];
		vec [maximumIndex] = vec [minimumIndex];
		vec [minimumIndex] = buferVariable;
		
		System.out.println(Arrays.toString(vec));
		//for (int i = 0; i < lengthVec; i++){
		//	System.out.print(vec[i] + " ");
		//}
		
	}
}
