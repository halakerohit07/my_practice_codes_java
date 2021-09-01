import java.util.Scanner;


class OneTwoSeries{

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter last index of array : ");
		int num = sc.nextInt();
		solution(num); 
	}

	static void solution(int num){
		int[] arr = new int[num+1];
		arr[0] = 0;
		arr[1] = 0;
		int j=0;
		int k=1;
		while(j<num-1 && k<num-1){
			j = j+2;
			k = k+2;
			arr[j] = arr[j-2] + 2;
			arr[k] = arr[k-2] + 1; 
		}


		for(int i=0; i<arr.length; i++){
			System.out.print(arr[i] + ",");
		}
	}

}


