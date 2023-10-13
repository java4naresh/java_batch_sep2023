package org.naresh.corejava.abstraction;

public class Udupi implements Hotel {

	@Override
	public void idly() {
		System.out.println("idly ravva 50%");
		System.out.println("minupa pappu 50%");
		System.out.println("Idly ready");
	}

	@Override
	public void dosa() {
		System.out.println("rice 50%");
		System.out.println("minupa pappu 50%");
		System.out.println("dosa ready");
	}

	@Override
	public void chapathi() {
		System.out.println("wheat 95%");
		System.out.println("water 5%");
		System.out.println("chapathi ready");
	}

	@Override
	public void puri() {
		System.out.println("wheat 90%");
		System.out.println("water 5%");
		System.out.println("oil 5%");
		System.out.println("puri ready");
	}

	@Override
	public void sambarIdly() {
		idly();
		System.out.println("add sambar extra");
		System.out.println("sambar idly ready");
	}

	@Override
	public void ravvaDosa() {
		System.out.println("soji 50%");
		System.out.println("minupa pappu 50%");
		System.out.println("dosa ready");
	}

}
