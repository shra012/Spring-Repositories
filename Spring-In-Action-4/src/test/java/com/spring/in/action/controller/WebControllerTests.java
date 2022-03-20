package com.spring.in.action.controller;

import com.spring.in.action.application.AppConfig;
import com.spring.in.action.application.DispatcherConfig;
import com.spring.in.action.model.Value;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import java.util.Map;

import static org.junit.Assert.*;

@WebAppConfiguration
@RunWith(SpringRunner.class)
@ContextConfiguration(classes = {AppConfig.class, DispatcherConfig.class})
public class WebControllerTests {

    @Autowired
    private WebController webController;

    @Test
    public void shouldReturnHealthResults() {
        Map<String, String> health = webController.health();
        assertNotNull(health);
        assertTrue(health.size() > 0);
        assertEquals("UP", health.get("status"));
    }


    @Test
    public void shouldReturnSameIdWhenValueEndpointIsAccessed() {
        Value value = webController.value(Value.builder().withId(10).build());
        assertNotNull(value);
        assertEquals(10, value.getId());
    }

}
