package com.demo;

import java.util.Scanner;

public class Primeno {

	public static void main(String[] args) {
		int Temp = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter no and check whether it is prime");
		int s = sc.nextInt();
		for (int i = 2; i <= s - 1; i++) {
			if (s % 2 == 0) {
				Temp = Temp + 1;
			}
		}
		if (Temp == 0) {
			System.out.println("no is prime");
		} else {
			System.out.println("not prime");
		}

	}

}
