package main;

import java.util.ArrayList;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in); // Create a Scanner object

		System.out.println("Enter Result Number: ");
		int result = s.nextInt();
		int[] testArrayFifteen = { 1, 4, 35, 5, 8, 10, 12, 22};

		System.out.println("Count "+ countPairs(result, testArrayFifteen));
	}

	private static int countPairs(int result, int[] list) {
		int count = 0;
		for (int i = 0; i < list.length - 1; i++) {
			for (int j = 1; j < list.length; j++) {
				int test = list[i] + list[j];
				//ArrayList<Integer> used = new ArrayList<Integer>();
				if (test == result) {
					//Needs to Add Check for used elements
					//!used.contains(list[i]) || !used.contains(list[j])
					System.out.println(list[i] +" "+ list[j]);
					//used.add(list[i]);
					//used.add(list[j]);
					count++;
				}
			}
		}
		return count;
	}
}