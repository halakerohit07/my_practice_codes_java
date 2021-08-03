import java.util.Scanner;

class GreatestOfTwoNumbers{

	public static int solution(int a, int b){
		return a>b ? a : b;
	}

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a : ");
		int a = sc.nextInt();
		System.out.print("Enter b : ");
		int b = sc.nextInt();
		System.out.println(solution(a, b));
	}

}