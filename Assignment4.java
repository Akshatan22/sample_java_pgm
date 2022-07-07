/**Q. 4 Write a Java program to print an array after changing the rows and columns of a given two-
dimensional array.
Original Array:
10 20 30
40 50 60
After changing the rows and columns of the said array:
10 40
20 50
30 60*/

import java.util.*;

class Assignment4{
	public static void main(String[] args){
		int arr[][]={{10,20,30},{40,50,60}};
		//int m=3,n=2;
		int trans[][]= new int [3][2];
		for(int i=0;i<arr[0].length;i++)
			for(int j=0;j<arr.length;j++){
				trans[i][j] = arr[j][i];
			}
		
		for(int i=0;i<trans.length;i++){
			for(int j=0;j<trans[0].length;j++){
				System.out.print(" "+trans[i][j]);
			}
			System.out.println(" ");
		}			
	}
}