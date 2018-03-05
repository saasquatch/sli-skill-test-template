package skillstest.controllers;

import play.mvc.Controller;
import play.mvc.Result;
import skillstest.util.RelativeTimeframe;
import skillstest.util.TotallyUnnecessaryStringUtils;

/**
 * This controller contains an action to handle HTTP requests
 * to the application's home page.
 */
public class HomeController extends Controller {

	public Result index() {
		return status(200, "Hello world!")
				.as("text/plain");
	}

	public Result stringReverse(String s) {
		// implement methods in TotallyUnnecessaryStringUtils to make this endpoint work properly
		return status(200, TotallyUnnecessaryStringUtils.reverse(s))
				.as("text/plain");
	}

	public Result parseTimeframe(String timeframe, String timeZone) {
		/*
		 * TODO implement this method OR the one that's commented out below it (not both)
		 *
		 * parse the timeframe, get the absolute interval relative to the present,
		 * and then return OK with the body being something like this:
		 * {
		 *   "from": "2018-01-01T22:12:41.174Z",
		 *   "to": "2018-01-02T22:12:41.174Z"
		 * }
		 *
		 * The result has to be a valid JSON with Content-Type being "application/json",
		 * and "from" and "to" have to be in ISO-8601 format.
		 *
		 * If the input is invalid, it should return an empty BAD REQUEST.
		 */
		RelativeTimeframe.parse(timeframe);
		return status(501);
	}

	/*
	 * Implement this method instead of the one above it if you are feeling adventurous.
	 * If you choose to do this one, you can delete the method above it.
	 *

	public CompletionStage<Result> parseTimeframe(String timeframe, String timeZone) {

	}

	*/

}
