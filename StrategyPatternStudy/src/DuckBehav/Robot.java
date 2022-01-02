package DuckBehav;

import DuckBehav.com.FlyWithWings;
import DuckBehav.com.No;

public class Robot extends Duck{
	public Robot() {
		quackBehaviour = new No();
		flyBehaviour = new FlyWithWings();
	}
}
