package com.dynabeast.chapter1;

import org.junit.Test;

import com.dynabeast.chapter1.behavior.impl.FlyRocketPowered;
import com.dynabeast.chapter1.duck.Duck;
import com.dynabeast.chapter1.duck.MallardDuck;
import com.dynabeast.chapter1.duck.ModelDuck;

public class MiniDuckSimulator {
	@Test
	public void testMallardDuck() {
		Duck mallard = new MallardDuck();
		mallard.performQuack();
		mallard.performFly();
		
		Duck model = new ModelDuck();
		model.performFly();
		model.setFlyBehavior(new FlyRocketPowered());
		model.performFly();
	}
}
