package utilities;

import org.junit.jupiter.api.Assertions;

class CalculationTest {

    @org.junit.jupiter.api.Test
    void testGetTotal() {
        int value1 = 1;
        int value2 = 1;
        int resultatAttentue = 2;
        Assertions.assertEquals(resultatAttentue, utilities.Calculation.getTotal(value1, value2));

    }
}