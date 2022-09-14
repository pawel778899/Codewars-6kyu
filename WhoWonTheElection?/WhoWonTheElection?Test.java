import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static junit.framework.TestCase.fail;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.nullValue;
import static org.junit.Assert.assertThat;

public class BallotsCounterTest {

    @Test
    public void testGetWinner_01() {
        assertThat(BallotsCounter.getWinner(Arrays.asList("A")), is("A"));
    }

    @Test
    public void testGetWinner_02() {
        assertThat(BallotsCounter.getWinner(Arrays.asList("A", "A", "A", "B", "B", "B", "A")), is("A"));
    }

    @Test
    public void testGetWinner_03() {
        assertThat(BallotsCounter.getWinner(Arrays.asList("A", "A", "A", "B", "B", "B")), is(nullValue()));
    }

    @Test
    public void testGetWinner_04() {
        assertThat(BallotsCounter.getWinner(Arrays.asList("A", "A", "A", "B", "C", "B")), is(nullValue()));
    }

    @Test
    public void testGetWinner_05() {
        assertThat(BallotsCounter.getWinner(Arrays.asList("A", "A", "B", "B", "C")), is(nullValue()));
    }   
}
