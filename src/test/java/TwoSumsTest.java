import org.junit.Test;

import static org.junit.Assert.*;

public class TwoSumsTest {

    @Test
    public void twoSum1() {
        TwoSums sums = new TwoSums();
        int[] arr = {1, 4 ,7};
        int[] expected = {0 , 2};
        assertArrayEquals(expected, sums.twoSum(arr, 8));
    }

    @Test
    public void twoSum2() {
        TwoSums sums = new TwoSums();

        int[] arr = {1, 4 , 4, 8};
        int[] expected = {0 , 3};

        assertArrayEquals(expected, sums.twoSum(arr, 9));
    }
}