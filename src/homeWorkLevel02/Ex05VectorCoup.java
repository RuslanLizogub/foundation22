package homeWorkLevel02;

import java.util.Arrays;

/* Исполнитель: ruslan_lizogub
 * Название упражнения: "Векторный переворот"
 * Условие: Написать метод выводящий элементы массива на экран в обратном порядке.
   В случае, если размер вектора некорректный, выводить сообщение "Неверный размер вектора"
   Метод: void revertVector(int[] vector)
   Пример:
   revertVector(int[] vector); // [1, 2, 3, 4, 5, 6, 7]
   [7, 6, 5, 4, 3, 2, 1]
 * */
public class Ex05VectorCoup {
	public static void main(String[] args) {
		int[] vector = {1,2,3,4,5};
		
		revertVector(vector);
		
    }
	
	public static void revertVector(int[] vector){
		int lengthVec = vector.length;
		if (lengthVec < 1){
			System.out.println("Неверный размер вектора");
			return;
		}
		int[] buferVector = new int[lengthVec];
		int dekrementLeng = lengthVec - 1;
		
		for (int i = 0; i < lengthVec; i++){
			buferVector[dekrementLeng - i] = vector[i];
		}
		
		System.out.println(Arrays.toString(buferVector));
	}
}
