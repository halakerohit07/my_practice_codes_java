import java.util.Scanner;


class SumOfFirstNNaturalNumbers{
	public static int solution(int n){
		return n*(n+1)/2;
	}

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter end :");
		int n = sc.nextInt();
		System.out.println(solution(n));

	}
}