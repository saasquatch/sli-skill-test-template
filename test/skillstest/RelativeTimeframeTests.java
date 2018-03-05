package skillstest;

import org.junit.Test;

public class RelativeTimeframeTests {

	@Test
	public void testAccuracy() {
		// TODO add tests for RelativeTimeframe based on the description

		/*
		 * 1. verify that "today" at 123456 (epochMilli) at UTC equals to
		 * 1970-01-01T00:00:00Z/1970-01-02T00:00:00Z
		 */

		/*
		 * 2. verify that "yesterday" at 123456 (epochMilli) at America/Vancouver equals to
		 * 1969-12-30T08:00:00Z/1969-12-31T08:00:00Z
		 */

		/*
		 * 3. verify that "previous_year" at 999999999999 (epochMilli) at Asia/Tokyo equals to
		 * 1999-12-31T15:00:00Z/2000-12-31T15:00:00Z
		 */

		/*
		 * 4. verify that "previous_4_weeks" at 123456789012345 (epochMilli) at US/Hawaii equals to
		 * 5882-02-05T10:00:00Z/5882-03-05T10:00:00Z
		 */

	}

	@Test
	public void testEquivalents() {
		// TODO add tests for RelativeTimeframe based on the description

		/*
		 * 1. verify that the following timeframes are equivalent:
		 * "today", "this_day", "this_days", "this_1_day", "this_1_days", "this_00001_days"
		 */

		/*
		 * 2. verify that the following timeframes are equivalent:
		 * "yesterday", "previous_day", "previous_days", "previous_001_day", "previous_1_days"
		 */

		/*
		 * FOR EVERY SUPPORTED TIME UNIT, verify that the following timeframes are equivalent:
		 * "this_<unit>", "this_1_<unit>", "this_001_<unit>"
		 */

	}

}
