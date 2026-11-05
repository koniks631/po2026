package agh.po.lab3;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class CodingBatTest {

    @Test
    public void testSleepIn() {
        CodingBat cb = new CodingBat();
        assertTrue(cb.sleepIn(false, true));
        assertFalse(cb.sleepIn(true, false));
        assertTrue(cb.sleepIn(false, true));
    }

    @Test
    public void testLoneTeen() {
        CodingBat cb = new CodingBat();
        assertTrue(cb.loneTeen(13, 99));
        assertTrue(cb.loneTeen(21, 19));
        assertFalse(cb.loneTeen(16, 18));
    }

    @Test
    public void testSum13() {
        CodingBat cb = new CodingBat();
        assertEquals(6, cb.sum13(new int[]{1, 2, 2, 1}));
        assertEquals(14, cb.sum13(new int[]{5, 7, 2}));
        assertEquals(3, cb.sum13(new int[]{13, 1, 2, 13, 2, 1, 13}));
    }

    @Test
    public void firstHalf() {
       CodingBat cb = new CodingBat();
       assertEquals("Woo", cb.firstHalf("WooHoo"));
       assertEquals("Hello", cb.firstHalf("HelloThere"));
       assertEquals("abc", cb.firstHalf("abcdef"));
    }

    @Test
    public void mapAB2() {
        CodingBat cb = new CodingBat();

        Map<String, String> map1 = new HashMap<>(Map.of("a", "aaa", "b", "aaa", "c", "cake"));
        assertEquals(Map.of("c", "cake"), cb.mapAB2(map1));

        Map<String, String> map2 = new HashMap<>(Map.of("a", "aaa", "b", "bbb"));
        assertEquals(Map.of("a", "aaa", "b", "bbb"), cb.mapAB2(map2));

        Map<String, String> map3 = new HashMap<>(Map.of("a", "aaa", "b", "bbb", "c", "aaa"));
        assertEquals(Map.of("a", "aaa", "b", "bbb", "c", "aaa"), cb.mapAB2(map3));
    }
}