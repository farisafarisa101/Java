package array;

import java.util.Arrays;


public class SortedArray {
	 public static void showArray(){
	 
		//declare, initilize
		int arr1[]= {10,9,8,7,6,5,4,3,2,1};
		//print 
		Arrays.sort(arr1);//sort method of array class
		System.out.println("Sorted Array is ");//
		for(int i=0;i<arr1.length;i++) {//printing array element
						System.out.print(" "+arr1[i]);
						}
						
			} 
	

	public static void main(String[] args) {
		showArray();

	}

}
