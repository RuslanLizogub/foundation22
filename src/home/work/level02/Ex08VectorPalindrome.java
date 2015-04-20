package home.work.level02;

import java.util.Arrays;
/* Исполнитель: ruslan_lizogub
 * Название упражнения: "Вектор палиндром"
 * Условие: Написать класс с методом определяющим, является ли массив палиндромом (одинаково читается и справа и слева)
   Пример палиндрома: 1234321
   Имя метода: boolean isVectorPalindrom(int[] vector)
 * */
public class Ex08VectorPalindrome {
	public static void main(String[] args) {
		int[] vector = {2,3,4,5,5,4,4,3,2};
		isVectorPalindrom(vector);
    }
	
	public static boolean isVectorPalindrom(int[] vect){
		int lengthVec = vect.length;
		if (lengthVec < 1){
			System.out.println("Неверный размер вектора");
		}
		int bufer = lengthVec / 2;
		int bufer2 = lengthVec - 1;
		for (int i = 0; i < bufer; i++){
			if(vect[i] == vect[bufer2 - i]){

			}else{
				return false;
			}
		}
		return true;
	}
}