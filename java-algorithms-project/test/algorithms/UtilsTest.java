import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class UtilsTest {

    @Test
    public void testGenerateRandomArray() {
        Utils utils = new Utils();
        int[] randomArray = utils.generateRandomArray(10);
        assertEquals(10, randomArray.length);
        for (int num : randomArray) {
            assertTrue(num >= 0 && num <= 100); // Assuming the random numbers are between 0 and 100
        }
    }

    @Test
    public void testPrintArray() {
        Utils utils = new Utils();
        int[] array = {1, 2, 3, 4, 5};
        utils.printArray(array); // This will print to the console, so we can't assert anything here
        // You may want to capture the output if needed, but it's not typically done in unit tests
    }
}