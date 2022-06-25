package com.mh.coding.level1;

public class ObjectAndInterface {

	public static void main(String[] args) {

		People p = new Man();
		p.say();

		p = new Man() {
			@Override
			public void say() {
				System.out.println("저는 여자 입니다.");
			}
		};

		p.say();

		// Overloading...확인만 해보세요
		// DI : Dependency Injection 기술 확인 한번 부탁~~~


	}
}
