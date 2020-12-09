package arrays;

import java.util.Random;

public class _00_ArrayCheatSheet {
	public static void main(String[] args) {
		//1. make an array of 5 Strings
		String[] arr = {"Hello", "Blob", "Java is the best", "Don't use C", "2 + 2 = 4"};
		//2. print the third element in the array
		System.out.println(arr[2]);
		//3. set the third element to a different value
		arr[2] = "Seriously, Java is the best";
		//4. print the third element again
		System.out.println(arr[2]);
		//5. use a for loop to print all the values in the array
		//   BE SURE TO USE THE ARRAY'S length VARIABLE
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		//6. make an array of 50 integers
		int[] intArr = new int[50];
		//7. use a for loop to make every value of the integer array a random number
		for (int i = 0; i < intArr.length; i++) {
			intArr[i] = new Random().nextInt(101);
		}
		//8. without printing the entire array, print only the smallest number in the array
		int smallestNumber = intArr[0];
		for (int i = 0; i < intArr.length; i++) {
			if(smallestNumber > intArr[i]) {
				intArr[i] = smallestNumber;
			}
		}
		System.out.println(smallestNumber);
		//9 print the entire array to see if step 8 was correct
		
		//10. print the largest number in the array.
		int biggestNumber = intArr[0];
		for (int i = 0; i < intArr.length; i++) {
			if(biggestNumber < intArr[i]) {
				intArr[i] = biggestNumber;
			}
		}
		System.out.println(biggestNumber);
	}
}
