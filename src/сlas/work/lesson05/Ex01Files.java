package сlas.work.lesson05;

import java.io.File;
import java.util.Scanner;

public class Ex01Files {
	
	public static void main(String[] args) throws Exception {
		Scanner scan = new Scanner(new File("/Users/ruslanlisogub/Desktop/TestEx1.txt"));
		
		String line;
		int counter = 0;
		while (scan.hasNext()){
			line = scan.nextLine();
			counter++;
			if(counter%2 == 0){
				System.out.println(line);
			}
		}
		//System.out.println(scan.nextLine());
	}
}
