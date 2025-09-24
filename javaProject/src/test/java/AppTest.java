package test.java;
import org.junit.Test;

import main.java.App;

import static org.junit.Assert.assertEquals;


public class AppTest {
    @Test
    public void testHello() {
        assertEquals("hello, world", App.sayHello());
    }


}
