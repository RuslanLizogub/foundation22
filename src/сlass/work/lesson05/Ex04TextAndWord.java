package сlass.work.lesson05;

public class Ex04TextAndWord {
	public static void main(String[] args) throws Exception {
		String word = "a";
		String text = "aaslkfasklfjlkalsfn aflskalsjflakjsf";
		counterWords(word, text);
	}
	
	public static void  counterWords (String word, String text){
		int length = text.length();
		int counterWord = 0;
		for(int i = 0; i < length; i++){
			char first = text.charAt(i);
			int indexWord = text.indexOf(word,i);
			if(indexWord > 0){
				counterWord++;
			}
		}
		System.out.println(counterWord);
    }
}
//доделать, задание в тетради
