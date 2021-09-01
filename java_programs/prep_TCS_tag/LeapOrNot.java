import java.util.Scanner;

class LeapOrNot{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter year : ");
		int year =  sc.nextInt();
		solution(year);
	}

	static void solution(int year){
		boolean leap = false;
		if(year % 4 == 0){
			if(year % 100 ==0){
				if(year % 400 == 0)
					leap = true;
				else
					leap = false;
			}
			else
				leap = true;
		}
		else{
			leap = false;
		}

		if(leap == true){
			System.out.println("Year " + year + " is a leap year.");
		}else{
			System.out.println("Year " + year + " is not a leap year..");
		}
	}
}