package com.javaex.practice;

import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String cal;
		double d1, d2;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("출력되는 내용을 입력하세요");
		System.out.print("기호: ");
		cal = sc.next();
		System.out.print("숫자1: ");
		d1 = sc.nextDouble();
		System.out.print("숫자2: ");
		d2 = sc.nextDouble();
		switch(cal) {
			case "+": System.out.print("결과는: "+(d1+d2));
			break;
			case "-": System.out.print("결과는: "+(d1-d2));
			break;
			case "*": System.out.print("결과는: "+(d1*d2));
			break;
			case "/": 
				if(d2==0) {System.out.println("계산할 수 없습니다");}
				else {System.out.print("결과는: "+(d1/d2));}
			break;
			default: System.out.println("계산할 수 없는 기호입니다.");
		}
		
		sc.close(); 
	}

}
