package myProject;

import java.util.Arrays;
import java.util.Scanner;




public class dynamicArray1 {
	

	

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner object=new Scanner(System.in);
			System.out.println("Enter the length of an array");
			int array_length=object.nextInt();
			System.out.println("Enter a elements of an array");
			int[] result=new int[array_length];
			for(int i=0; i<array_length;i++){
				result[i]=object.nextInt();
			}
			System.out.println(Arrays.toString(result));
			object.close();
		}

	}


