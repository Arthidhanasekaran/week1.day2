package week1.day2;

import java.util.Arrays;

public class Array {

	public static void main(String[] args) {
       int arr[] = {100,49,398,34,1,267};
       int arrsize = arr.length;
       System.out.println(arrsize);
       
       for (int i = 0; i < arrsize; i++) {
		System.out.println("arr["+i+"] = " + arr[i]);
	}
       
       Arrays.sort(arr);
       System.out.println("The sorted array");
       for (int i = 0; i <arrsize; i++) {
    	   
		System.out.println("arr["+i+"] = "+ arr[i]);
	}
       
       System.out.println("The 2nd largest number is" + arr[arrsize-2]);
       System.out.println("The 2nd smallest number is" + arr[1]);
       
	}

}
