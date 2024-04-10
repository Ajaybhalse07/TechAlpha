package com.techalphatask;

public class AlfaPtrn {

	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {
			char ch = 'A';
			for (int j = 1; j <= i; j++) {
				if (j == 1 || j == i) {
					System.out.print(ch++ + "");
				} else {
					System.out.print(" ");
					ch++;
				}
			}
			for (int k = 1; k <= 2 * (5 - i); k++) {
				System.out.print(" ");
			}
			char c = 'A';
			for (int j = 1; j <= i; j++) {
				if (j == 1 || j == i) {
					System.out.print(c++ + "");
				} else {
					System.out.print(" ");
					c++;
				}
			}
			System.out.println();
		}

		for (int i = 5; i >= 1; i--) {
			char ch = 'A';
			for (int j = 1; j <= i; j++) {
				if (j == 1 || j == i) {
					System.out.print(ch++ + "");
				} else {
					System.out.print(" ");
					ch++;
				}
			}
			for (int k = 1; k <= 2 * (5 - i); k++) {
				System.out.print(" ");
			}
			char c = 'A';
			for (int j = 1; j <= i; j++) {
				if (j == 1 || j == i) {
					System.out.print(c++ + "");
				} else {
					System.out.print(" ");
					c++;
				}
			}
			System.out.println();
		}

	}

}
