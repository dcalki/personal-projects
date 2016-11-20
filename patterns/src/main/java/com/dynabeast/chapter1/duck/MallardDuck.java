package com.dynabeast.chapter1.duck;

import com.dynabeast.chapter1.behavior.impl.FlyWithWings;
import com.dynabeast.chapter1.behavior.impl.Quack;

public class MallardDuck extends Duck {
	public MallardDuck() {
		quackBehavior = new Quack();
		flyBehavior = new FlyWithWings();
	}

	@Override
	public void display() {
		System.out.println("I am a mallard duck!");
	}
}
