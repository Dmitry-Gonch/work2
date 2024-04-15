package lesson_12.lesson_12_testng;

import org.testng.Assert;
import org.testng.annotations.Test;

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
        Assert.assertEquals(factorial(4), 24);
        Assert.assertEquals(factorial(5), 120);
        Assert.assertEquals(factorial(20), 2_432_902_008_176_640_000L);
    }
}
