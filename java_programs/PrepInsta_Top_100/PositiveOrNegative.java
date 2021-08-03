import java.util.Scanner;


class PositiveOrNegative{
	
	public static void solution(int num){
		if(num>0){
			System.out.println("Positive number");
		}
		if(num==0){
			System.out.println("Zero");
		}
		if(num<0){
			System.out.println("Ngative number");
		}
	}

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number : ");
		int num = sc.nextInt();
		solution(num);
	}
}