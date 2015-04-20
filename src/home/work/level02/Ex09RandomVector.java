package home.work.level02;

import java.util.Arrays;

/* Исполнитель: ruslan_lizogub
 * Название упражнения: "Случайный вектор"
 * Условие: Написать класс с методом заполняющий массив случайными числами в диапазоне от 0 до 10
   Имя метода: void fillVectorByRandom(int[] vector)
 * */
public class Ex09RandomVector {
	public static void main(String[] args) {
		int[] vector = {2,3,4,5,5,4,4,3,2};
		fillVectorByRandom(vector);
		System.out.println(Arrays.toString(vector));
    }
	
	public static void fillVectorByRandom(int[] vect){
		int lengthVec = vect.length;
		if (lengthVec < 1){
			System.out.println("Неверный размер вектора");
		}
		for (int i = 0; i < lengthVec; i++){
			vect[i] = (int) (Math.random()*10);
		}
	}
}