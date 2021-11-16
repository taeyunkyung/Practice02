package com.javaex.practice;

import java.util.Scanner;

public class Ex09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i1, i2;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째 숫자: ");
		i1 = sc.nextInt();
		System.out.print("두번째 숫자: ");
		i2 = sc.nextInt();
		if((i1>=i2)&&(i1%i2==0)) {
			System.out.println(i2+" 는(은) "+i1+" 의 약수입니다.");
		} else if (i1>=i2) {
			System.out.println(i2+" 는(은) "+i1+" 의 약수가 아닙니다.");
		} else if((i2>i1)&&(i2%i1==0)) {
			System.out.println(i1+" 는(은) "+i2+" 의 약수입니다.");
		} else {
			System.out.println(i1+" 는(은) "+i2+" 의 약수가 아닙니다.");
		}
		
		sc.close();
	}

}
