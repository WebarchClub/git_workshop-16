import java.util.Scanner;

public class ArrayMenu {
	static int n;
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		
		int[] arr = new int[64];
		int check =0;
		do {
			System.out.println("1.Enter new array \t 2.Display array \t 3.Search \t 4.Sort (0 to exit)");
			check = scan.nextInt();
			switch(check) {
				case 1:
					arr = EnterArray();
					break;
				case 2:
					Display(arr);
					break;
				case 3:
					Search(arr);
					break;
				case 4:
					arr = Sort(arr);
					break;
				case 0:
					break;
				default:
					System.out.println("Unknown input... try again");
			}
			
		}while(check!=0);
	}
	
	public static int[] EnterArray() {
		int[] array1 = new int[64];
		System.out.println("Enter size of array :");
		n = scan.nextInt();
		System.out.println("Enter elements of array : ");
		for(int i=0; i<n; i++){
			array1[i] = scan.nextInt();
		}
		
		return array1;
	}
	
	public static void Display(int[] array1) {
		System.out.println("The array : ");
		for(int i=0; i<n; i++)
			System.out.println(array1[i]);
	}
	
	public static int[] Sort(int[] array1) {
		int temp;
		for(int i = 0; i<n-1; i++) {
			for(int j = 0; j<n-i-1; j++) {
				if(array1[j]>array1[j+1]) {
					temp = array1[j];
					array1[j] = array1[j+1];
					array1[j+1] = temp;
				}
			}
		}
		return array1;
	}
	
	public static void Search(int[] array1) {
		int ele;
		int index = -1;
		System.out.println("Enter target : ");
		ele = scan.nextInt();
		for(int i=0; i<n; i++) {
			if(array1[i] == ele){
				index = i;
				break;
			}
		}
		if (index ==-1)
			System.out.println("Target not found");
		else
			System.out.println("Target found at index :" + index);
	}
	
}