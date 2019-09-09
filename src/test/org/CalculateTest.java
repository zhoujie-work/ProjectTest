package test.org;

import org.idea.work.Calculate;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculateTest {


    @Test
    public void add() {
        assertEquals(6, new Calculate().add(3, 3));
    }

    @Test
    public void divide() {

    }
}
