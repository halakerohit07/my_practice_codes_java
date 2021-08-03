import java.util.Scanner;
import java.math.BigInteger;

class FactorialBigInteger{

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number : ");
		int n = sc.nextInt();
		System.out.println("Solution : " + solution(n));
	}

	static BigInteger solution(int n){
		BigInteger res = new BigInteger("1");
		for(int i=2; i<=n; i++){
			res = res.multiply(BigInteger.valueOf(i));
		}
		return res;
	}

}