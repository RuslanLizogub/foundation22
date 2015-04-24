package home.work.level03;

import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

/*
 *  Бал: 100
 *  Исполнитель: ruslan_lizogub
 *  Код решения: 9bT37klvR9vbhS3YNXUzF+2rqhU=
 *  Задание: Цензура
 *  Пользователь вводит имя текстового файла (text.txt), заменить все "нецензурные слова" в файле на [вырезано цензурой],
 	результат записать в тот же файл. "нецензурные слова" находятся в файле obscene.txt, каждое в отдельной строке.
 	Пример:
 	obscene.txt {паршивец, хам, тряпка, смерд, симулянт, собака, сорванец, тупой как пробка, рохля, козёл, негодяй}
 	text.txt {Расскажу вам как козёл, хам и симулянт удивлялись что собака выиграла грант}
 	text.txt {Расскажу вам как [вырезано цензурой], [вырезано цензурой] и [вырезано цензурой] удивлялись
 	 что [вырезано цензурой] выиграла грант}
 */

public class Ex03Censorship {
	public static void main(String[] args) throws Exception {
		  Scanner scan = new Scanner(System.in);
		  final String fileName = scan.nextLine();
		  controlCensorship(fileName);  
	 }
	 public static void controlCensorship(String fileName) throws Exception {
		  //помещаем текст в динамический массив
		  Scanner fileScan = new Scanner(new File(fileName));
		  ArrayList<String> textFile = new ArrayList<String>();
		  while (fileScan.hasNext()) {
			  textFile.add (fileScan.next());
		  }
		  fileScan.close();
		  int textFileSize = textFile.size();
		  System.out.println(textFile);
		  
		  // создаем массив не цезурных слов из файла
		  Scanner obsceneScan = new Scanner(new File("obscene.txt"));
		  ArrayList<String> obsceneFile = new ArrayList<String>();
		  while (obsceneScan.hasNextLine()) {
			  obsceneFile.add (obsceneScan.nextLine());
		  }
		  obsceneScan.close();
		  System.out.println(obsceneFile);
		  
		  //Поместить обе переменные в стринги и разбить по словам и разделителям
		  int lengthTextFileArray = textFile.size();
		  int obsceneFileFileArray = obsceneFile.size();
		  String textFileString ="";
		  String obsceneFileString = "";
		  for (int i = 0; i < lengthTextFileArray; i++){
			  textFileString = textFileString + " " + textFile.get(i);
		  }
		  for (int i = 0; i < obsceneFileFileArray; i++){
			  obsceneFileString = obsceneFileString + " " + obsceneFile.get(i);
		  }
		  
		  //разбиваем по индексам
		  String[] stringArrayWordsTextFile = textFileString.split("[ ,.]+");
		  String[] stringArrayWordsobsceneFile = obsceneFileString.split("[ ,.]+");
		  
		  //сравнить строки по условию задачи
		  int lengthStringArrayWordsTextFile = stringArrayWordsTextFile.length;
		  int lengthStringArrayWordsobsceneFile = stringArrayWordsobsceneFile.length;
		  
		  for (int i = 1; i < lengthStringArrayWordsTextFile; i++){
			  String buferTextFile = stringArrayWordsTextFile[i];
			 for(int g = 0; g < lengthStringArrayWordsobsceneFile; g++){
				 String buferObsceneFile = stringArrayWordsobsceneFile[g];
				 if(buferTextFile.equals(buferObsceneFile)){
					 textFile.set(i, "[вырезано цензурой]");
				 }
			 }
		  }
		  System.out.println(textFile);
		  
		  //помещяем содержимое массива в стринг
		  int lengthArray = textFile.size();
		  String result = "";
		  for(int i = 0; i < lengthArray; i++){
			  result = result + " " + textFile.get(i);
		  }
		  
		  //теперь вернуть все в файл
		  FileWriter fw = new FileWriter(fileName);
		  //for (int i = 0; i < textFileSize; i++) {
			  fw.write(result);
		  //}
		  fw.close();
	 }
}
