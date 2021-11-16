package com.javaex.practice;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i1, i2;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자2개를 입력해주세요");
		System.out.print("숫자1: ");
		i1 = sc.nextInt();
		System.out.print("숫자2: ");
		i2 = sc.nextInt();
		if(i1>=i2) {
			System.out.print("큰수: "+i1+"   ");
			System.out.print("작은수: "+i2+"입니다.");
		} else {
			System.out.print("큰수: "+i2+"   ");
			System.out.print("작은수: "+i1+"입니다.");
		}
		
		sc.close();
	}

}
