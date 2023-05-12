package day08.modi.protec.pac2;

import day08.modi.protec.pac1.A;

public class D extends A{
	
	//protected는 상속관계에서 super를 통한 접근이 가능함.
	public D() {
		super();
		super.bool = true;
		super.method();
	}
	//override됨
	protected void method() {
		
	}
	
}
