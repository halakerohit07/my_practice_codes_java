import java.util.Scanner;

public class ArrayRotation{

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter size of array : ");
		int size = sc.nextInt();
		int arr[] = new int[size];
		System.out.print("Enter array elements : ");
		for(int i=0; i<size; i++){
			arr[i] = sc.nextInt();
		}
	
		System.out.print("Enter value of k : ");
		int k = sc.nextInt();

		System.out.print("Before Rotation : ");
		for(int i=0; i<arr.length; i++){	
		System.out.print(arr[i] + " ");
		}

		System.out.println();

		rotate(arr, k);
		System.out.print("After Rotation  : ");
		for(int i=0; i<arr.length; i++){
			System.out.print(arr[i] + " ");		
		}	

	}


	static void reverse(int arr[], int start, int end){
		int temp;
		while(start<end){
			temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
	}

	static void rotate(int[] arr,  int k){
		reverse(arr, 0, arr.length-1);
		reverse(arr, 0, k-1);
		reverse(arr, k, arr.length-1);
	}

}