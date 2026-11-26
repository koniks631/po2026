package agh.po.symulator;

import org.junit.Test;

import static org.junit.Assert.*;

public class PozycjaTest {

    @Test
    public void przemiesc() {
        Pozycja p = new Pozycja(0, 0);
        Pozycja cel = new Pozycja(100, 100);

        p.przemiesc(1, 2, cel);

        assertEquals(2, p.getX(), 0.001);

    }
}