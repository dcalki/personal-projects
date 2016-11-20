package com.dynabeast.chapter1.behavior.impl;

import com.dynabeast.chapter1.behavior.QuackBehavior;

public class MuteQuack implements QuackBehavior {

	public void quack() {
		System.out.println("<< Silence >>");
	}

}
