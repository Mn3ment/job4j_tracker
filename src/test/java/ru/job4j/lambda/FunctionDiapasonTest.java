package ru.job4j.lambda;
import org.junit.Test;
import java.util.Arrays;
import java.util.List;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class FunctionDiapasonTest {
    @Test
    public void whenLinearFunctionThenLinearResults() {
        List<Double> result = FunctionDiapason.diapason(5, 8, x -> 2 * x + 1);
        List<Double> expected = Arrays.asList(11D, 13D, 15D);
        assertThat(result, is(expected));
    }

    @Test
    public void whenQuatroFunctionThenQuatroResults() {
        List<Double> result = FunctionDiapason.diapason(2, 6, x -> x * x);
        List<Double> expected = Arrays.asList(4D, 9D, 16D, 25D);
        assertThat(result, is(expected));
    }

    @Test
    public void whenExponentialFunctionThenExponentialResults() {
        double a = 2;
        List<Double> result = FunctionDiapason.diapason(2, 5, x -> Math.pow(a, x));
        List<Double> expected = Arrays.asList(4D, 8D, 16D);
        assertThat(result, is(expected));
    }

}