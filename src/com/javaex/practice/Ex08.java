package com.javaex.practice;

import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i1, i2, i3;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자 3개를 입력해주세요");
		System.out.print("숫자1: ");
		i1 = sc.nextInt();
		System.out.print("숫자2: ");
		i2 = sc.nextInt();
		System.out.print("숫자3: ");
		i3 = sc.nextInt();
		if((i1<=i2)&&(i1<=i3)) {
			System.out.println("가장 작은수는 "+i1+" 입니다.");
		} else if((i2<i1)&&(i2<i3)) {
			System.out.println("가장 작은수는 "+i2+" 입니다.");
		} else {
			System.out.println("가장 작은수는 "+i3+" 입니다.");
		}
		
		sc.close(); 
	}

}
