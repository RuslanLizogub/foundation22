package сlass.work.lesson06;

import java.io.File;
import java.util.Arrays;
import java.util.Scanner;

public class Ex01 {
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
		System.out.println(numberWords);
	}
}
