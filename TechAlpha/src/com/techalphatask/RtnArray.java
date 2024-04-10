package com.techalphatask;

import java.util.Scanner;

public class RtnArray {
      public static void main(String args[]) {
    	  int a[] = {1,2,3,4,5,6,7};
  		int rt;
  		Scanner cr=new Scanner(System.in);
  		System.out.print("Input Array : ");
  		for(int i=0;i<a.length;i++)
  		{
  			System.out.print(a[i]+" ");
  		}
  		System.out.println();
  		
          System.out.println("Enter the many time rotate array..!");
          rt=cr.nextInt();
          for(int i=0;i<rt;i++) {
          	int ft=a[0];
          	for(int j=0;j<a.length-1;j++) {
          		a[j]=a[j+1];
          	}
          	a[a.length-1]=ft;
          }
          System.out.println();
          System.out.println("OutPut Array : ");
          for(int i=0; i<a.length;i++) {
          	System.out.print(a[i]+" ");
          }
          
  		
      }
}
