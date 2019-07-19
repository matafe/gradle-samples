package com.matafe.application1.core;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author ferrazm
 */
public class CoreService {

    private static final Logger LOGGER = LoggerFactory.getLogger(CoreService.class);

    /**
     * Get the message from the core service.
     * 
     * @return The message.
     */
    public String getMessage() {
	LOGGER.debug("getting message");
	return "Hi application 1 core service from  - " + new Date();
    }
}
