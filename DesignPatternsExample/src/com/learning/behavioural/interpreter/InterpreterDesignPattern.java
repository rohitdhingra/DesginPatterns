package com.learning.behavioural.interpreter;

import java.text.Format;
import java.text.Normalizer;
import java.util.Scanner;
import java.util.regex.Pattern;

public class InterpreterDesignPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Evaluator eval = new Evaluator();
		System.out.println("Enter the expression in Postfix notation");
		Scanner sc = new Scanner(System.in);
		String expression = sc.nextLine();
		sc.close();
		System.out.println(eval.parse(expression).interpret());
		Pattern p;
		Normalizer n;
		Format f;
				
	}

}
