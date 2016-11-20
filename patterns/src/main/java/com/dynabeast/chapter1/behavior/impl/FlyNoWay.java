package com.dynabeast.chapter1.behavior.impl;

import com.dynabeast.chapter1.behavior.FlyBehavior;

public class FlyNoWay implements FlyBehavior {

	public void fly() {
		System.out.println("I can't fly");
	}

}
