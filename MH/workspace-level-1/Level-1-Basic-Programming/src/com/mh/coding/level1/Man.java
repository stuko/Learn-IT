package com.mh.coding.level1;

public class Man implements People{

	@Override
	public void say() {
		System.out.println("저는 남자입니다.");
	}

	@Override
	public String listen(String message) {
		return "남자는 잘 못들어요 " + message;
	}

	@Override
	public void sin() {
		System.out.println("나쁜 짓을 했어요");
	}

	@Override
	public void breath() {
		System.out.println("숨을 잘 쉬어요");
	}

}
