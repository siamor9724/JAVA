package DuckBehav.test;

import DuckBehav.Mallad;
import DuckBehav.Model;
import DuckBehav.Robot;

public class Tester {

	public static void main(String[] args) {
		Mallad mal = new Mallad();
		mal.performQuack();
		mal.performFly();
		
		Model model = new Model();
		model.performQuack();
		model.performFly();
		
		Robot robot = new Robot();
		robot.performQuack();
		robot.performFly();
	}

}
