package com.mandark.assignment.CombinationSort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class CombinatinSort {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter length of the list");
		int n = scan.nextInt();
		List<String> list = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			list.add(scan.nextLine());
		}
		List<String> L1 = sortByFirstChar(list);
		List<String> L2 = sortListForSameInitialInDesc(list);
		System.out.println("L1: "+L1);
		System.out.println("L2: "+L2);
	}

	public static List<String> sortByFirstChar(List<String> L1) {
		// we use comparator to sort based on our own logic
		Comparator<String> comp = new Comparator<String>() {

			@Override
			public int compare(String str1, String str2) {
				return str1.substring(0, 1).compareTo(str2.substring(0, 1));
			}
		};
		Collections.sort(L1, comp);
		return L1;
	}

	public static List<String> sortListForSameInitialInDesc(List<String> list) {
		// We will create another comparator to sort same first letters in decreasing
		// order
		Comparator<String> comp1 = new Comparator<String>() {

			@Override
			public int compare(String str1, String str2) {
				int num1 = Integer.parseInt(str1.substring(1));
				int num2 = Integer.parseInt(str2.substring(1));
				if (num1 < num2)
					return 1;
				return -1;
			}
		};
		List<String> L2 = new ArrayList<>();
		for (char ch = 'a'; ch <= 'z'; ch++) {
			List<String> temp = new ArrayList<>();
			for (String s : list) {
				if (s.charAt(0) == ch)
					temp.add(s);
			}
			Collections.sort(temp, comp1);
			L2.addAll(temp);
		}
		return L2;
	}
}
