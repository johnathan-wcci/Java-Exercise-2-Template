package com.wecancodeit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.TestMethodOrder;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.MethodOrderer.OrderAnnotation;

@TestMethodOrder(value = OrderAnnotation.class)
public class ExercisesTest extends BaseSolution {

    @Test
    @Order(1)
    public void testExercise1() throws Exception {
        assertEquals(4, iTest.getIntResult());
    }

    @Test
    @Order(2)
    public void testExercise2() throws Exception {
        assertEquals(12, iTest.getIntResult());
    }

    @Test
    @Order(3)
    public void testExercise3() throws Exception {
        assertEquals(25, iTest.getIntResult());
    }

    @Test
    @Order(4)
    public void testExercise4() throws Exception {
        assertEquals(5, iTest.getIntResult());
    }

    @Test
    @Order(5)
    public void testExercise5() throws Exception {
        assertEquals(45, iTest.getIntResult());
    }

    @Test
    @Order(6)
    public void testExercise6() throws Exception {
        assertEquals(23, iTest.getIntResult());
    }

    @Test
    @Order(7)
    public void testExercise7() throws Exception {
        assertEquals(56, iTest.getIntResult());
    }

    @Test
    @Order(8)
    public void testExercise8() throws Exception {
        assertEquals(20.0d, iTest.getDoubleResult(), 0.01);
    }

    @Test
    @Order(9)
    public void testExercise9() throws Exception {
        assertEquals(48, iTest.getIntResult());
    }

    @Test
    @Order(10)
    public void testExercise10() throws Exception {
        assertEquals(2, iTest.getIntResult());
    }

    @Test
    @Order(11)
    public void testExercise11() throws Exception {
        assertEquals(18, iTest.getIntResult());
    }

    @Test
    @Order(12)
    public void testExercise12() throws Exception {
        assertEquals(22, iTest.getIntResult());
    }

    @Test
    @Order(13)
    public void testExercise13() throws Exception {
        assertEquals(80, iTest.getIntResult());
    }

    @Test
    @Order(14)
    public void testExercise14() throws Exception {
        assertEquals(130, iTest.getIntResult());
    }

    @Test
    @Order(15)
    public void testExercise15() throws Exception {
        assertEquals(75, iTest.getIntResult());
    }

    @Test
    @Order(16)
    public void testExercise16() throws Exception {
        assertEquals(265, iTest.getIntResult());
    }

    @Test
    @Order(17)
    public void testExercise17() throws Exception {
        assertEquals(10, iTest.getIntResult());
    }

    @Test
    @Order(18)
    public void testExercise18() throws Exception {
        assertEquals(70, iTest.getIntResult());
    }

    @Test
    @Order(19)
    public void testExercise19() throws Exception {
        assertEquals(45, iTest.getIntResult());
    }

    @Test
    @Order(20)
    public void testExercise20() throws Exception {
        assertEquals(10, iTest.getIntResult());
    }

    @Test
    @Order(21)
    public void testExercise21() throws Exception {
        assertEquals(47, iTest.getIntResult());
    }

    @Test
    @Order(22)
    public void testExercise22() throws Exception {
        assertEquals(130, iTest.getIntResult());
    }

    @Test
    @Order(23)
    public void testExercise23() throws Exception {
        assertEquals(35, iTest.getIntResult());
    }

    @Test
    @Order(24)
    public void testExercise24() throws Exception {
        assertEquals(170, iTest.getIntResult());
    }

    @Test
    @Order(25)
    public void testExercise25() throws Exception {
        assertEquals(150, iTest.getIntResult());
    }
}
