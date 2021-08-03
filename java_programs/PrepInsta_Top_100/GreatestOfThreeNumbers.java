import java.util.Scanner;

class GreatestOfThreeNumbers{

	public static int solution(int a, int b, int c){

		if(a > b && a >c){
			return a;
		}else if(b > c && b > a){
			return b;
		}else{
			return c;
		}

	}

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a : ");
		int a = sc.nextInt();
		System.out.print("Enter b : ");
		int b = sc.nextInt();
		System.out.print("Enter c : ");
		int c = sc.nextInt();
		System.out.println(solution(a,b,c));
	}

}