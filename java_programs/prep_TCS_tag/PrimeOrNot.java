import java.util.Scanner;


class PrimeOrNot{
	
	public static void main(String[] args){
		
		check();
	}

	static void check(){
		Scanner sc = new Scanner(System.in);
		boolean cond = false;
		while(cond != true){
			System.out.print("Enter number : ");
			int n = sc.nextInt();
			if(n > 0){
				isPrime(n);
				cond = true;
			}else{
				System.out.println("Number is not positive , try again with a positive number ....");
			}
		}
	}

	static void isPrime(int n){
		int count = 0;
		for(int i=2; i<n; i++){
			if(n%i==0){
				count++;
			}	
		}
		if(count ==0){
			System.out.println("Number is prime ..");
		}else{
			System.out.println("Number is not prime....... ");
		}
	}

}