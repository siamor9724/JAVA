package DuckBehav;

import DuckBehav.com.FlyBehaviour;
import DuckBehav.com.QuackBehaviour;

public abstract class Duck {
	QuackBehaviour quackBehaviour;
	FlyBehaviour flyBehaviour;

	public void performQuack() {
		quackBehaviour.quack();
	}

	public void performFly() {
		flyBehaviour.fly();
	}

}
