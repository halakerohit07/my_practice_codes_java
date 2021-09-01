import java.util.Scanner;

class Turns{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of Turns : ");
		int n = sc.nextInt();
		Solution(n);
	}

	static void Solution(int n){
		char c = 'R';
		int distance = 0;
		int x=0;
		int y=0;

		while(n>0){

			switch(c){

				case 'R' : 
					distance = distance + 10;
					x = x + distance;
					c = 'U';
					break;

				case 'U' : 
					distance = distance + 10;
					y = y + distance;
					c = 'L';
					break;

				case 'L' :
					distance = distance + 10;
					x = x - distance;
					c = 'D';
					break;

				case 'D' :
					distance = distance + 10;
					y = y - distance;
					c = 'A';
					break;

				case 'A' :
					distance = distance + 10;
					x = x + distance;
					c = 'R';
					break;
					
				}	



			n--;	
		}

		System.out.println( "("+ x + " , " + y + ")");
	}
}