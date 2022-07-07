/*Q. 5 Write a Java program to find the k largest elements in a given array. Elements in the array can
be in any order.
Expected Output:
Original Array:
[1, 4, 17, 7, 25, 3, 100]
3 largest elements of the said array are:
100 25 17
*/

import java.util.Arrays;

public class Assignment5{
	public static void main(String [] args){
		int arr[] = {5,6,3,90,46,32};
		Arrays.sort(arr);
		
		for(int i = arr.length-1;i >= arr.length-3;i--)
			System.out.println(arr[i]);
		
	}
}