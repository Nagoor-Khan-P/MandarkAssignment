package com.mandark.assignment.ShortestDistanceofManhattanPath;

import java.util.Scanner;

public class ShortestDistanceofManhattanPath {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int[] startPoint=new int[] {1,2};
		String path="NEWS";
		int[] endPoint=new int[] {startPoint[0],startPoint[1]};
		for(char ch:path.toCharArray()) {
			switch(ch){
				case 'N':
					endPoint[1]++;
					break;
				case 'S':
					endPoint[1]--;
					break;
				case 'W':
					endPoint[0]++;
					break;
				case 'E':
					endPoint[0]--;
					break;
				default:
					continue;
			}
		}
		double y=Math.pow(endPoint[1]-startPoint[1], 2);
		double x=Math.pow(endPoint[0]-startPoint[0], 2);
		System.out.println(Math.sqrt(y+x));
		
	}

}
