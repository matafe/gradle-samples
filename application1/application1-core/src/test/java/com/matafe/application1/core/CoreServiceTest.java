package com.matafe.application1.core;

import static org.hamcrest.CoreMatchers.startsWith;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class CoreServiceTest {

    @Test
    public void testGetMessage() {
	assertThat(new CoreService().getMessage(), startsWith("Hi application 1 core service from  -"));
    }
}
