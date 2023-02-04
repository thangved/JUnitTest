import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class MyCalcTest {
    private final MyCalc myCalc = new MyCalc();

    @Test
    void add() {
        assertEquals(10, myCalc.add(4, 6));
    }

    @Test
    void mul() {
        assertEquals(12, myCalc.mul(3, 4));
    }

    @Test
    void sub() {
        assertEquals(2, myCalc.sub(6, 4));
    }

    @Test
    void div() {
        assertEquals(2, myCalc.div(4, 2));

    }

    @Test
    void mux() {
        assertEquals(8, myCalc.mux(2, 3));
    }

    @Test
    void qrt() {
        assertEquals(100, myCalc.qrt(10));
    }

    @Test
    void progression() {
        assertEquals(5, myCalc.progression(2, 3, 2));
    }

    @Test
    void sumProgression() {
        assertEquals(59, myCalc.progression(2, 3, 20));
    }

}
