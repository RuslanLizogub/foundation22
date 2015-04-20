package сlas.work.lesson06;

import java.util.Arrays;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.ArrayList;

// работаем с файлом Test2.txt
public class Ex03Revers2Luba {
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
		  FileWriter fw = new FileWriter(fileName);
		  for (int i = list.size()-1; i >= 0; i--) {
		   fw.write(list.get(i) + ' ');
		  }
		  fw.close();
	 }
}
