package controllers;

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

}
