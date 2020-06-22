import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.Assertions.*;


class CalculatorTest {
    Calculator calculator;

    @BeforeEach
    void beforeEach() {
        calculator = new Calculator();
    }

    @Test
    void dodawanie() {
        System.out.println("test dodawania");
        int expected = 4;
        int actual = Calculator.dodawanie(2, 2);
        assertEquals(expected, actual);

    }

    @Test
    void odejmowanie() {
        System.out.println("Test odejmowania");
        int [] tablica= {1,2,3};
        int [] tablica2={1,2,3};

        int expected = 40;
        int actual = calculator.odejmowanie(80, 40);
        assertEquals(expected, actual);
        assertNotEquals(0, actual);

        //drugi sposob poza assertEquals

        assertThat(actual)
                .isEqualTo(40)
                .isBetween(38, 42)
                .isPositive();
        assertArrayEquals(tablica, tablica2);
        assertThat(tablica).isEqualTo(tablica2);
    }

    @Test
    void dzielenie() {
        System.out.println("To jest test dzielenia");
        int expected=3;

    }

}