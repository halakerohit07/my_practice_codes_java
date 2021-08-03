import java.util.Scanner;

class SumOfNumbersInGivenRange{

	public static int solution(int start, int end){
		// int sum=0;
		// for(int i=start; i<=end; i++){
		// 	sum += i;
		// }
		// return sum;

		//usinf recursion
		return (start == end) ? end : start + solution(start+1, end);
	}

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Start : ");
		int start = sc.nextInt();
		System.out.print("Enter end : ");
		int end = sc.nextInt();
		System.out.println(solution(start, end));
	}

}