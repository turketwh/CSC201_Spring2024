import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PartA {

    InsertionSorter insertionSorter;

    @Before
    public void setUp() {
        insertionSorter = new InsertionSorter();
    }

    @Test
    public void test1() {
        int[] expected = {3,4,5,6};
        int[] data = {3,4,5,6};
        insertionSorter.sort(data);
        assertArrayEquals(data, expected);
    }

    @Test
    public void test2() {
        int[] expected = {3,4,5,6};
        int[] data = {6,5,4,3};
        insertionSorter.sort(data);
        assertArrayEquals(data, expected);
    }

    @Test
    public void test3() {
        int[] data = {3,4,5,6};
        insertionSorter.sort(data);
        assertEquals(insertionSorter.getNumberOfComparisons(),3);
    }

    @Test
    public void test4() {
        int[] data = {6,5,4,3};
        insertionSorter.sort(data);
        assertEquals(insertionSorter.getNumberOfComparisons(),6);
    }

    @Test
    public void test5() {
        int[] data = {};
        insertionSorter.sort(data);
        assertEquals(insertionSorter.getNumberOfComparisons(),8);
    }

    @Test
    public void test6() {
        int[] data = {};
        insertionSorter.sort(data);
        assertEquals(insertionSorter.getNumberOfComparisons(),10);
    }

    @Test
    public void test7() {
        int[] data = {};
        insertionSorter.sort(data);
        assertEquals(insertionSorter.getNumberOfComparisons(),15);
    }

    @Test
    public void test8() {
        int[] data = {};
        insertionSorter.sort(data);
        assertEquals(insertionSorter.getNumberOfComparisons(),9);
    }

    @Test
    public void test9() {
        int[] data = {};
        insertionSorter.sort(data);
        assertEquals(insertionSorter.getNumberOfComparisons(),12);
    }
}