package lesson4.problem4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Question4Test {

    @Test
    void isPalindrome() {
        Question4 problem = new Question4();

        assertTrue(problem.isPalindrome(121));
    }
}