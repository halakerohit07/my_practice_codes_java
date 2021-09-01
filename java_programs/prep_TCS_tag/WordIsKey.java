import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;


class WordIsKey{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter word to check : ");
		String word = sc.nextLine();
		solution(word);
	}


	static void solution(String word){
		ArrayList<String> arr = new ArrayList<>(Arrays.asList("break", "case", "continue", "default", "defer", "else","for", "func", "goto","if", "map", "range", "return", "struct", "type", "var"));
		
		if(arr.contains(word)){
			System.out.println("Word is keyword");
		}else{
			System.out.println("Not keyword, OKAY to use...");
		}
	}
}