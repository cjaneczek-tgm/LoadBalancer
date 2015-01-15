package server.sbehavior;

import java.util.Random;

public class RAMBehavior implements ServerBehavior {


	/**
	 * @see server.sbehavior.ServerBehavior#useRes()
	 */
	public void useRes() {
		String garbage1 = "";
		String garbage2 = "";
		String temp = "";
		Random r = new Random();

		String alphabet = "abcdefghijklmnopqrstuvwxyz42ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		for (int i = 0; i < 10000; i++) {
			garbage1 += alphabet.charAt(r.nextInt(alphabet.length()));
		}

		for (int i = 0; i < 10000; i++) {
			garbage2 += alphabet.charAt(r.nextInt(alphabet.length()));
		}

		for (long i = 0; i < 10000000; i++) {
			temp = garbage1;
			garbage1 = garbage2;
			garbage2 = temp;
		}
	}

}
