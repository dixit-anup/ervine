package com.dixit.ceti.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Controllers are annotated with @Controller. It is found by Spring because of @ComponentScan annotation in AppConfig.
 * The method will intercept GET request to "/" to which the response will be sent.
 * @ResponseBody indicates that whatever this method returns will be response body,
 * and in this case it's just a "Hello world" String.
 *
 */

@Controller
class IndexController {
    @SuppressWarnings("SameReturnValue")
    @RequestMapping(value = "/core", method = RequestMethod.GET)
    public @ResponseBody String showIndex() {
        return "Core Environment";
    }

}