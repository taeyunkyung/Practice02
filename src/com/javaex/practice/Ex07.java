package com.javaex.practice;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i1, i2;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째 숫자: ");
		i1 = sc.nextInt();
		System.out.print("두번째 숫자: ");
		i2 = sc.nextInt();
		if(i1>=i2) {
			System.out.println("몫: "+(i1/i2));
			System.out.println("나머지: "+(i1%i2));
		} else {
			System.out.println("몫: "+(i2/i1));
			System.out.println("나머지: "+(i2%i1));		
		}
		
		sc.close();
	}

}
