package com.mh.coding.level1;

public class ObjectAndInterface {
	
	public static void main(String[] args) {
		
		People p = new Man();
		p.say();
		
		p = new Man() {
			@Override
			public void say() {
				System.out.println("���� ���� �Դϴ�.");
			}
		};
		
		p.say();
		
		// Overloading...Ȯ�θ� �غ�����
		// DI : Dependency Injection ��� Ȯ�� �ѹ� ��Ź~~~
		
		
	}
}