import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * playground
 * Created by kc on 17-2-27.
 */
public class BitOperationLibraryTest {
    @Test
    public void abs() throws Exception {
        assertEquals(4, bitOperationLibrary.abs(4));
        assertEquals(4, bitOperationLibrary.abs(-4));
    }

    @Test
    public void negate() throws Exception {
        int a = 10, b = -a;
        assertEquals(a, bitOperationLibrary.negate(b));
    }

    @Test
    public void swap() throws Exception {
        int x = 4, y = 6;
        int[] pair = new int[2];
        pair[0] = x;
        pair[1] = y;
        bitOperationLibrary.swap(pair);
        assertEquals(x, pair[1]);
        assertEquals(y, pair[0]);
    }

    private BitOperationLibrary bitOperationLibrary =  new BitOperationLibrary();

    @Test
    public void isEven() throws Exception {
        assertTrue(bitOperationLibrary.isEven(10));
        assertFalse(bitOperationLibrary.isEven(11));
    }

}