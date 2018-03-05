package skillstest.controllers;

import play.mvc.Controller;
import play.mvc.Result;

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
    	 * TODO parse the timeframe and return something like this:
    	 * {
    	 *   "from": "2018-01-01T22:12:41.174Z"
    	 *   "to": "2018-01-02T22:12:41.174Z"
    	 * }
    	 */
    	return status(501);
    }

}
