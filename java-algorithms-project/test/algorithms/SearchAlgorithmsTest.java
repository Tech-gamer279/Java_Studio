import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SearchAlgorithmsTest {

    @Test
    public void testLinearSearch() {
        int[] array = {1, 2, 3, 4, 5};
        int target = 3;
        int expectedIndex = 2;
        int actualIndex = SearchAlgorithms.linearSearch(array, target);
        assertEquals(expectedIndex, actualIndex);
    }

    @Test
    public void testLinearSearchNotFound() {
        int[] array = {1, 2, 3, 4, 5};
        int target = 6;
        int expectedIndex = -1;
        int actualIndex = SearchAlgorithms.linearSearch(array, target);
        assertEquals(expectedIndex, actualIndex);
    }

    @Test
    public void testBinarySearch() {
        int[] array = {1, 2, 3, 4, 5};
        int target = 4;
        int expectedIndex = 3;
        int actualIndex = SearchAlgorithms.binarySearch(array, target);
        assertEquals(expectedIndex, actualIndex);
    }

    @Test
    public void testBinarySearchNotFound() {
        int[] array = {1, 2, 3, 4, 5};
        int target = 0;
        int expectedIndex = -1;
        int actualIndex = SearchAlgorithms.binarySearch(array, target);
        assertEquals(expectedIndex, actualIndex);
    }
}