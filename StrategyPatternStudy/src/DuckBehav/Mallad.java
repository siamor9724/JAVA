package DuckBehav;

import DuckBehav.com.FlyWithWings;
import DuckBehav.com.Quack;

public class Mallad extends Duck{

	public Mallad () {
		
		quackBehaviour = new Quack();
		flyBehaviour = new FlyWithWings();
	}

	


}
