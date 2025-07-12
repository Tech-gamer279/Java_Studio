import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SortAlgorithmsTest {

    @Test
    public void testBubbleSort() {
        SortAlgorithms sorter = new SortAlgorithms();
        int[] input = {5, 3, 8, 4, 2};
        int[] expected = {2, 3, 4, 5, 8};
        sorter.bubbleSort(input);
        assertArrayEquals(expected, input);
    }

    @Test
    public void testQuickSort() {
        SortAlgorithms sorter = new SortAlgorithms();
        int[] input = {7, 2, 1, 6, 8, 5};
        int[] expected = {1, 2, 5, 6, 7, 8};
        sorter.quickSort(input);
        assertArrayEquals(expected, input);
    }

    @Test
    public void testMergeSort() {
        SortAlgorithms sorter = new SortAlgorithms();
        int[] input = {12, 11, 13, 5, 6, 7};
        int[] expected = {5, 6, 7, 11, 12, 13};
        sorter.mergeSort(input);
        assertArrayEquals(expected, input);
    }
}