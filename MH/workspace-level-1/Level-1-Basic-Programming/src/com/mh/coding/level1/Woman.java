package com.mh.coding.level1;

public class Woman implements People{

	@Override
	public void say() {
		System.out.println("���� ���� �Դϴ�");
	}

	@Override
	public String listen(String message) {
		return "���ڴ� �� ���� " + message;
	}

	@Override
	public void sin() {
		System.out.println("����� �Ծ����");
	}

	@Override
	public void breath() {
		System.out.println("���� �����");
	}

}
