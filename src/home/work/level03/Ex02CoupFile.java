package home.work.level03;

import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

/*
 *  Бал: 100
 *  Исполнитель: ruslan_lizogub
 *  Код решения: k9xT+MO/UUWrZMtmF+b0J9zegDE=
 *  Пользователь вводит имя текстового файла (text.txt), перевернуть содержимое файла (содержимое файла должно измениться)
	Пример:
	йцукен
	некуцй
 */
public class Ex02CoupFile {
	 public static void main(String[] args) throws Exception {
		  Scanner scan = new Scanner(System.in);
		  final String fileName = scan.nextLine();
		  reverseWords(fileName);  
	 }
	 public static void reverseWords(String fileName) throws Exception {
		  Scanner fileScan = new Scanner(new File(fileName));
		  ArrayList<String> list = new ArrayList<String>();
		  while (fileScan.hasNext()) {
		   list.add (fileScan.next());
		  }
		  fileScan.close();
		  int size = list.size(); 
		  System.out.println(list);
		  
		  //нужно теперь разбить масив list посимвольно и перевернуть содержимое
		  String valuesVector = "";
		  for (int i = 0; i <= size - 1; i++){
			  valuesVector = valuesVector + list.get(i);
		  }
		  int length = valuesVector.length();
		  String result = "";
		  for(int i = 0; i < length; i++){
			  result = result + valuesVector.charAt((length - 1) - i);
		  }
		  System.out.println(result);

		  
		  //теперь вернуть все в файл
		  FileWriter fw = new FileWriter(fileName);
		  for (int i = 0; i < size; i++) {
		  fw.write(result);
		  }
		  fw.close();
	 }
}
