package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class RestCaltTest {
    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/data.csv")
    public void testRestInYear(int expected, int income, int expenses, int threshold) {
        RestCalcService service = new RestCalcService();

        int actual = service.calculate(income, expenses, threshold );

        Assertions.assertEquals(expected, actual);
    }
}

