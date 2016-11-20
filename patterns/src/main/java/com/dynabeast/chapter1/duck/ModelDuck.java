package com.dynabeast.chapter1.duck;

import com.dynabeast.chapter1.behavior.impl.FlyNoWay;
import com.dynabeast.chapter1.behavior.impl.Quack;

public class ModelDuck extends Duck {

	public ModelDuck() {
		this.flyBehavior = new FlyNoWay();
		this.quackBehavior = new Quack();
	}
	
	@Override
	public void display() {
		System.out.println("I am a model duck!");
	}

}
