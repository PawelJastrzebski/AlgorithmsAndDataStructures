package Tests;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

@Disabled
public class Stack_push_pop {


    @AfterEach
    public void afterEach() {
        System.out.println("After each");
    }

    @BeforeEach
    public void beforeEach() {
        System.out.println("Before each");
    }

    @Test
    public void pushTest() {
        System.out.println("test");
    }
}