package server.sbehavior;

import org.apache.log4j.Logger;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class IOBehavior implements ServerBehavior {

	static Logger logger = org.apache.log4j.Logger.getLogger(IOBehavior.class);

	/**
	 * @see server.sbehavior.ServerBehavior#useRes()
	 */
	public void useRes() {
		File f = new File("Load.txt");
		String garbage = "";
		Random r = new Random();

		String alphabet = "abcdefghijklmnopqrstuvwxyz42ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		for (int i = 0; i < 1000; i++) {
			garbage += alphabet.charAt(r.nextInt(alphabet.length()));
		}

		try {
			BufferedWriter wr = new BufferedWriter(new FileWriter("Load.txt",true));
			for(int z = 0; z < 1000; z++){
				wr.write(garbage+"\n");
			}
			wr.close();
			this.logger.info("IOBehavior successfully finished the waste!");
		}
		catch(IOException ioe){
			this.logger.info("IOBehavior got an IO Problem!");
		}
	}

}
