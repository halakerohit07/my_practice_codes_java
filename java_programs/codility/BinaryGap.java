import java.util.Scanner;

public class BinaryGap{
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number : ");
		int n = sc.nextInt();
		System.out.println("largest binary gap is : " + binaryGap(n) );
	}

	static int binaryGap(int n){
		int gap=0;
		int gapFinal=0;
		char[] bin = Integer.toBinaryString(n).toCharArray();
		for(int i=0; i<bin.length; i++){
			if(bin[i]=='0'){
				gap++;
			}
			else{
				if(gapFinal<gap){
					gapFinal=gap;
					gap=0;
				}
			}
		}

		return gapFinal;
	}
}			