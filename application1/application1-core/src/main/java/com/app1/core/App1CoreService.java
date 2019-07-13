package com.app1.core;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class App1CoreService {

    private static final Logger LOGGER = LoggerFactory.getLogger(App1CoreService.class);

    public String getMessage() {
	LOGGER.debug("getting message");
	return "Hi core app1";
    }
}
