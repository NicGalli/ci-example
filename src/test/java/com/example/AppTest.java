package com.example;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
     void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }
    //commentnnn
    @Test
     void testHello()
    {
    	App app = new App();
		assertThat(app.sayHello()).isEqualTo("hello");
    }
}