package com.javaex.practice;

import java.util.Scanner;

public class Ex13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double x;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 입력해 주세요");
		System.out.print("숫자: ");
		x = sc.nextDouble();
		if(x<=0) {
			System.out.println("계산결과는 "+(x*x*x-9*x+2)+" 입니다.");
		} else {
			System.out.println("계산결과는 "+(7*x+2)+" 입니다.");
		}
		
		sc.close();
	}

}
