package lesson4.problem1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Question1Test {

    @Test
    void power() {
        Question1 problem = new Question1();
        double result = 4;

        assertEquals(problem.power(2, 2), result);
    }
}