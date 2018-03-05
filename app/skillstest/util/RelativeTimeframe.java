package skillstest.util;

/**
 * Implementation of Keen's relative timeframe.<br>
 * Specs: https://keen.io/docs/api/#relative-timeframes
 */
public class RelativeTimeframe {

	// TODO add your own constructor and fields and stuff

	/**
	 * Get an absolute interval based on the current {@link RelativeTimeframe} relative
	 * to the given absolute time
	 * @param epochMilli relative to
	 * @param timeZone if null, then UTC will be used
	 * @return
	 */
	public Object toIntervalRelativeTo(long epochMilli, String timeZone) {
		/*
		 * TODO change the return type and possibly parameter types to whatever you see fit
		 * and implement this method. You are allowed to add additional dependencies in
		 * build.sbt if you want.
		 */
		return null;
	}

	/**
	 * Parse a Keen relative timeframe.
	 * @throws IllegalArgumentException if the input is invalid
	 */
	public static RelativeTimeframe parse(String s) throws IllegalArgumentException {
		// TODO implement parsing
		return null;
	}

}
