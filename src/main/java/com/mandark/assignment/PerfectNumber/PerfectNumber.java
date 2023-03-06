package com.mandark.assignment.PerfectNumber;

import java.util.Scanner;

public class PerfectNumber {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int num=scan.nextInt();
		System.out.println(isPerfect(num));
	}
	public static boolean isPerfect(int num) {
		if(num<=1)
			return false;
		int sum=1;
		for(int i=2;i<=num/2;i++) {
			if(num%i==0)
				sum+=i;
		}
		return sum==num;
	}

}
