package com.mandark.assignment.SwappingMinandMax;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class SwappingMinAndMax {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		List<Integer> a=new ArrayList<>();
		List<Integer> b=new ArrayList<>();
		System.out.println("Enter length of lists");
		int n=scan.nextInt();
		System.out.println("Enter list1 values:");
		for(int i=0;i<n;i++) {
			a.add(scan.nextInt());
		}
		System.out.println("Enter list2 values:");
		for(int i=0;i<n;i++) {
			b.add(scan.nextInt());
		}
		System.out.println("Minmum possible value of product of max of a and b: "+minMax(a,b));
	}
	public static int minMax(List<Integer> a, List<Integer> b) {
		int maxA=Collections.max(a);
		int maxB=Collections.max(b);
		if(maxB>maxA) {
			List<Integer> temp=a;
			a=b;
			b=temp;
		}
		maxB=0;
		for(int i=0;i<a.size();i++) {
			if(a.get(i)<b.get(i)) {
				int temp1=a.remove(i);
				int temp2=b.remove(i);
				a.add(i,temp2);
				b.add(i,temp1);
			}
			maxB=Math.max(maxB, b.get(i));
		}
		return maxA*maxB;
	}

}
