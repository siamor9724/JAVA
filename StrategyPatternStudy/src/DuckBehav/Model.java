package DuckBehav;

import DuckBehav.com.No;
import DuckBehav.com.NoFly;

public class Model extends Duck{
	public Model() {
		quackBehaviour = new No();
		flyBehaviour = new NoFly();
	}
}
