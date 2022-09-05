package world.inetum.accademicts3;

import org.junit.Test;

import static org.junit.Assert.*;

public class UtilTest {

    @Test
    public void findLargestNumber() {
        int[] numbers1 = new int[] { 0, 1, 2, 3, 4, 5 };
        assertEquals(Util.findLargestNumber(numbers1), 5);

        int[] numbers2 = new int[] { 0, 0, -5, 0, 0, 0 };
        assertEquals(Util.findLargestNumber(numbers2), 0);

        int[] numbers3 = new int[] { 4 };
        assertEquals(Util.findLargestNumber(numbers3), 4);
    }
}