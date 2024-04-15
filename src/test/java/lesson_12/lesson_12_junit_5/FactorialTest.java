package lesson_12.lesson_12_junit_5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/*
Создайте 2 ветки: Lesson_12_junit_5 и Lesson_12_testng.
Напишите программу, позволяющую вычислить факториал числа. Эта программа должна быть в каждой ветке.
В ветке Lesson_12_junit_5 напишите юнит-тесты для этой программы, используя Junit 5.
В ветке Lesson_12_testng  напишите юнит-тесты, используя TestNG.
 */
public class FactorialTest {
    private long factorial(int n) {
        return n <= 1 ? 1L : (long) n * factorial(n - 1);
    }

    @Test
    public void testFactorial() {
        Assertions.assertEquals(24, factorial(4));
        Assertions.assertEquals(120, factorial(5));
        Assertions.assertEquals(2_432_902_008_176_640_000L, factorial(20));
    }
}
