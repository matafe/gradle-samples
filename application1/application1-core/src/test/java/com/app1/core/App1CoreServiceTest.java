package com.app1.core;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class App1CoreServiceTest {
    @Test
    public void testSomeLibraryMethod() {
	assertThat(new App1CoreService().getMessage(), equalTo("Hi core app1"));
    }
}
