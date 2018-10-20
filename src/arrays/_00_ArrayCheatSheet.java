package arrays;

import java.util.Arrays;
import java.util.Random;

import javax.swing.text.html.HTMLDocument.HTMLReader.ParagraphAction;

import javafx.scene.paint.Stop;

public class _00_ArrayCheatSheet {
	
	public static void main(String[] args) {
		//1. make an array of 5 Strings
		//int[] array = new int[5];
		//2. print the third element in the array
		//System.out.println(array[3]);
		//3. set the third element to a different value
	//	array[3]=5;
		//4. print the third element again
	//	System.out.println(array[3]);
		//5. use a for loop to print all the values in the array
		//   BE SURE TO USE THE ARRAY'S length VARIABLE
		//for(int i=0;i<array.length;i++) {
			//System.out.println(array[i]);
			
		//}
		
		//6. make an array of 50 integers
		int[] array2= new int[50];
		int store=99;
		int enlarge=0;
		//7. use a for loop to make every value of the integer array a random number
		for(int x=0;x<array2.length;x++) {
			//Random random = new Random();
		//	int integer = random.nextInt(50);
			array2[x]= new Random().nextInt(150);
			//System.out.println(array2[x]);
		
		//8. without printing the entire array, print only the smallest number in the array
			
			if(array2[x]<store) {
				store=array2[x];
			}
			else if(array2[x]>enlarge){
				enlarge=array2[x];
				
			}
	//	System.out.println();
		//9 print the entire array to see if step 8 was correct
		//for(int t=0;t<50;t++) {
		//	System.out.println(array2[t]);
			
		//}
		//10. print the largest number in the array.
		}
		System.out.println("Smallest value: " + store);
		for(int i=0;i<array2.length;i++) {
			System.out.println("All values in order: " + array2[i]);
		}
		System.out.println("Largest value: " +enlarge);
	}
}
