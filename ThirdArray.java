import java.util.Scanner;
public class ThirdArray {
 public static void main(String[] args) {
	 Scanner s=new Scanner(System.in);
	 System.out.println("Enter the size of array");
		int size=s.nextInt();
	 int[] arr1=new int[size];
	 System.out.println("Enter the size of array 2");
		int size2=s.nextInt();
		int[] arr2=new int[size2];
	 System.out.println("Enter the elements of first array");
	 for(int i=0;i<size;i++) {
		 arr1[i]=s.nextInt();
	 }
	 System.out.println("Enter the elements of second array");
	 for(int i=0;i<size2;i++) {
		 arr2[i]=s.nextInt();
	 }
	 
	 int[] arr3=new int[size+size2];
	 for(int i=0;i<size;i++) {
		 arr3[i]=arr1[i];
	 }
	 for(int i=0;i<size2;i++) {
		 arr3[i+size]=arr2[i];
	 }
	 
	 System.out.println("After merging first array and second array: ");
	 for(int j: arr3) {
		 System.out.print(j+" ");
	 }
}
}

