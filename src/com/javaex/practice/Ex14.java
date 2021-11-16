package com.javaex.practice;

import java.util.Scanner;

public class Ex14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double p;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("수익을 입력해주세요");
		System.out.print("금익: ");
		p = sc.nextDouble();
		if(p>=8000) {
			System.out.println("소득세는 "+(1000*0.09+3000*0.18+4000*0.27+0.36*(p-8000))+" 입니다.");
		} else if(p>4000) {
			System.out.println("소득세는 "+(1000*0.09+3000*0.18+0.27*(p-4000))+" 입니다.");
		} else if(p>1000 ) {
			System.out.println("소득세는 "+(1000*0.09+0.18*(p-1000))+" 입니다.");
		} else if(p>=0) {
			System.out.println("소득세는 "+(0.09*p)+" 입니다.");
		} else {
			System.out.println("잘못 입력했습니다.");
		}
			
		sc.close();
	}

}
