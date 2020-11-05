import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	int arr[] = new int[10];
	
	for(int i=0;i<arr.length;i++) {
		arr[i] = scanner.nextInt();
	}
	scanner.close();
	
   Arrays.sort(arr);
    
   System.out.print(arr[0]);
	
	
	}
}
