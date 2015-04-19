package сlass.work.lesson06;

import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Ex03Revers {
	public static void main(String[] args) throws Exception {
		Scanner scanConsole = new Scanner(System.in);
		System.out.println("Введите имя файла:");
		String nameFile = scanConsole.next();
		
		Scanner scanFile = new Scanner(new File("/Users/ruslanlisogub/Desktop/" + nameFile));
		String line = "";
		while (scanFile.hasNextLine()){
			line += scanFile.nextLine();
			System.out.println(line);
		}
		
		String[] words = line.split("[ ,\n]+");
		System.out.println(Arrays.toString(words));
		int numberWords = words.length;
		
		String value = "";
		for (int i = 0; i < numberWords; i++){
			if(i < numberWords - 1){
				value = value + words[i] + ",";
			}else{
				value = value + words[i];
			}
		}
		
		ArrayList<String> list = new ArrayList<>(Arrays.asList(value));
		System.out.println(list);
		
		FileWriter fw = new FileWriter("/Users/ruslanlisogub/Desktop/" + nameFile);
		for (int i = list.size() - 1; i >= 0; i++){
			fw.write(list.get(i) + ' ');
		}
		fw.close();
	}
}
