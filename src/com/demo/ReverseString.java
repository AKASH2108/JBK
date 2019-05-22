package com.demo;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		String rev="";
		Scanner sc=new Scanner(System.in);
		System.out.println("enter string to reverse it");
		String s=sc.nextLine();
		for (int i=s.length()-1;i>=0;i--) {
			rev=rev+s.charAt(i);
		}System.out.println(rev);
	}

}
