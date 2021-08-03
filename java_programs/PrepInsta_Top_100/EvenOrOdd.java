import java.util.Scanner;

class EvenOrOdd{

	public static void solution(int n){
		if(n%2==0){
			System.out.println("Even");
		}else{
			System.out.println("Odd");
		}
	}

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number : ");
		int n = sc.nextInt();
		solution(n);
	}

}