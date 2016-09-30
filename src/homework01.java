
public class homework01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 1. Java 工程的创建,Main 方法的创建 
		 * 2. 
		 * *********** 
		 * **Android** 
		 * ***********
		 */
		System.out.println("*************");
		System.out.println("**Android**");
		System.out.println("*************");

		/* 3.189元如何使用最少的100元,50元,20元,10元,5元,1元组成,并输出各面值钱币的张数. */
		int money = 189;
		int m_100 = money / 100; // 1张100
		int m_50 = money % 100 / 50; // 1张50
		int m_20 = money % 50 / 20;// 1张20
		int m_10 = money % 50 % 20 / 10;// 1张10
		int m_5 = money % 50 % 20 % 10 / 5;// 1张5
		int m_1 = money % 50 % 20 % 10 % 5 / 1; // 4张1
		

		System.out.println("100元:"+m_100+"张");
		System.out.println("50元:"+m_50+"张");
		System.out.println("20元:"+m_20+"张");
		System.out.println("10元:"+m_10+"张");
		System.out.println("5元:"+m_5+"张");
		System.out.println("1元:"+m_1+"张");

		/* 4.不用第三个变量交换两个整数 */

		int a1 = 3;
		int b1 = 5;

		System.out.println("交换前:"+a1 + "  " + b1);
		// 交换两个变量值
		a1 = a1 + b1;
		b1 = a1 - b1;
		a1 = a1 - b1;

		System.out.println("交换后:"+a1 + "  " + b1);

	}

}
