import java.util.Scanner;

class Factorial{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number : ");
		int n = sc.nextInt();
		System.out.println("Factorial of " + n + " is " + fact(n));	
	}


	static int fact(int n){
		return n==0 ? 1 : n * fact(n-1);
	}
}