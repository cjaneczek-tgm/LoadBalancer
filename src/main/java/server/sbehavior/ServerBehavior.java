package server.sbehavior;

public interface ServerBehavior {

	/**
	 * The Method which uses resources specified by the chosen Behavior
	 * CPU,RAM,IO are the resources that can be wasted
	 */
	public abstract void useRes();

}
