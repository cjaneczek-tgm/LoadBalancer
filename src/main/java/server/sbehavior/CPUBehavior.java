package server.sbehavior;

import java.util.ArrayList;

public class CPUBehavior implements ServerBehavior {


	/**
	 * @see server.sbehavior.ServerBehavior#useRes()
	 */
	public void useRes() {
		ArrayList<Thread> list =  new ArrayList<Thread>();
		for(int i = 0; i < 3; i++){
			list.add(new Thread(new Loop()));
		}
	}

}
