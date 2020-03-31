package com.assignment.oo;

import java.util.ArrayList;
import java.util.Scanner;

public class PractiseArrayList {
	public static void main(String[] args) {
		
		Scanner userInput = new Scanner(System.in);
		ArrayList<String> a1 = new ArrayList<String>();
		System.out.println("Start size:" + a1.size());
		String input = userInput.next();
		while(!input.equals("End"))
		{
			a1.add(input);
			input = userInput.next();
		}
		System.out.println("-----");
		for(int i = 0; i < a1.size();i++)
		{
			System.out.println(a1.get(i));
			
		}
		System.out.println("New Size:" + a1.size());
		
	}
}
