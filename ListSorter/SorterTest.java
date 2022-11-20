package ListSorter;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class SorterTest {
    
    @Test
    public void SortOneElement() {
        var input = Arrays.asList(4);
        var output = Arrays.asList(4);

        assertEquals(output, Sorter.Sort(input));
    }

    @Test
    public void SortTwoElements() {
        var input = Arrays.asList(4, 2);
        var output = Arrays.asList(2, 4);

        assertEquals(output, Sorter.Sort(input));
    }

    @Test
    public void SortNoElements() {
        List<Integer> input = Arrays.asList();
        List<Integer> output = Arrays.asList();

        assertEquals(output, Sorter.Sort(input));
    }

    @Test
    public void SortPresortedList() {
        var input = Arrays.asList(1,2,3,4);
        var output = Arrays.asList(1,2,3,4);

        assertEquals(output, Sorter.Sort(input));
    }

    @Test
    public void SortBackwardsList() {
        var input = Arrays.asList(4,3,2,1);
        var output = Arrays.asList(1,2,3,4);

        assertEquals(output, Sorter.Sort(input));
    }

    @Test
    public void SortRandomList() {
        var input = Arrays.asList(2,7,4,8,9,1);
        var output = Arrays.asList(1,2,4,7,8,9);

        assertEquals(output, Sorter.Sort(input));
    }

    @Test
    public void SortListWithDuplicates() {
        var input = Arrays.asList(3,2,1,2);
        var output = Arrays.asList(1,2,2,3);

        assertEquals(output, Sorter.Sort(input));
    }
}
