package TestPackage;
import java.util.ArrayList;
import java.util.Scanner;

public class Skanner {
	public static void main(String[] args){
		  
		  ArrayList<String> textFile = new ArrayList<String>();
		  
		  textFile.add("11");
		  textFile.add("22");
		  textFile.add("33");
		  
		  textFile.set(0, "[вырезано цензурой]");
		  
		  System.out.println(textFile);

	}
}