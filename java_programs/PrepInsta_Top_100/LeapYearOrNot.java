import java.util.Scanner;

class LeapYearOrNot{

	public static void solution(int year){
		if(year%4 == 0)
			System.out.println(year + " is leap year.");
		else
			System.out.println(year + " is not a leap year.");
	}

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter year : ");
		int year = sc.nextInt();
		solution(year);

	}

}