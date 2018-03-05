package skillstest.controllers;

import play.mvc.Controller;
import play.mvc.Result;
import skillstest.util.RelativeTimeframe;

/**
 * This controller contains an action to handle HTTP requests
 * to the application's home page.
 */
public class HomeController extends Controller {

	public Result index() {
		return status(200, "{\"message\":\"Hello world!\"}")
				.as("application/json");
	}

	public Result parseTimeframe(String timeframe, String timeZone) {
		/*
		 * TODO parse the timeframe and return OK with the body being something like this:
		 * {
		 *   "from": "2018-01-01T22:12:41.174Z"
		 *   "to": "2018-01-02T22:12:41.174Z"
		 * }
		 *
		 * The result has to be a valid JSON, and "from" and "to" have to be in ISO-8601 format.
		 * If the input is invalid, it should return an empty BAD REQUEST.
		 */
		RelativeTimeframe.parse(timeframe);
		return status(501);
	}

}
