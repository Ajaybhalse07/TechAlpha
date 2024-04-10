package com.techalphatask;

public class RmvDbktEmt {

	public static void main(String[] args) {
		int i,j;
		int arr[]={1,2,2,3,3,4,5};
		int len =arr.length;
		int temp[]=new int[arr.length];
		j=0;
		for(i=0;i<len-1;i++) {
			if(arr[i] !=arr[i+1]) {
				temp[j++] =arr[i];
			}
		}
		temp[j++] =arr[len - 1];
		for(int k=0;k<j;k++) {
			System.out.print(temp[k]+" ");
			
		}
		


	}

}
