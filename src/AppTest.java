// src/AppTest.java
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppTest {
    @Test
    public void testGetGreeting() {
        assertEquals("Hello, World!", App.getGreeting());
    }
}

