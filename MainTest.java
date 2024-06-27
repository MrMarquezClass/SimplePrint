import org.junit.Test;
import static org.junit.Assert.*;

public class MainTest {

    @Test
    public void testMain() {
        // Capture the output
        java.io.ByteArrayOutputStream outContent = new java.io.ByteArrayOutputStream();
        System.setOut(new java.io.PrintStream(outContent));

        // Call the main method
        Main.main(new String[]{});

        // Check the output
        assertEquals("3 + 1 = 4\n", outContent.toString());
    }
}
