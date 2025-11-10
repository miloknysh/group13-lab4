package com.example.mycalculator;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class EvaluatorTest {

    private String actual;
    private String expected;
    private Evaluator eval = new Evaluator();


    @Test
    public void evaluateAddition() throws Exception {

        actual = eval.evaluate("2.7+3.4");
        expected = "6.10";
        assertEquals(expected, actual);

        actual = eval.evaluate("50.43+10.57");
        expected = "61";
        assertEquals(expected, actual);

        actual = eval.evaluate("-5.74+17.32");
        expected = "11.58";
        assertEquals(expected, actual);

        actual = eval.evaluate("-80+1");
        expected = "-79";
        assertEquals(expected, actual);

        actual = eval.evaluate("31.9+-6.38");
        expected = "25.52";
        assertEquals(expected, actual);

        actual = eval.evaluate("-74+-3");
        expected = "-77";
        assertEquals(expected, actual);
    }

    @Test
    public void evaluateAdditionFail1() throws Exception{
        actual = eval.evaluate("2.5+3.5");
        expected = "6.0";
        assertEquals(expected, actual);
    }

    @Test
    public void evaluateAdditionFail2() throws Exception{
        actual = eval.evaluate("1.1+3.2");
        expected = "4.3";
        assertEquals(expected, actual);

    }

    @Test
    public void evaluateSubtraction() throws Exception {
        actual = eval.evaluate("2.7-3.4");
        expected = "-0.70";
        assertEquals(expected, actual);

        actual = eval.evaluate("50.43-10.57");
        expected = "39.86";
        assertEquals(expected, actual);

        actual = eval.evaluate("-5.74-17.32");
        expected = "-23.06";
        assertEquals(expected, actual);

        actual = eval.evaluate("-80-1");
        expected = "-81";
        assertEquals(expected, actual);

        actual = eval.evaluate("-4.7-2.3");
        expected = "-7";
        assertEquals(expected, actual);

    }

    @Test
    public void evaluateSubtractionFail1() throws Exception{
        actual = eval.evaluate("2.5-3.5");
        expected = "-1.0";
        assertEquals(expected, actual);
    }

    @Test
    public void evaluateSubtractionFail2() throws Exception{
        actual = eval.evaluate("5-3.001");
        expected = "1.999";
        assertEquals(expected, actual);
    }


    @Test
    public void evaluateMultiplication() throws Exception{
        actual = eval.evaluate("5.2×3");
        expected = "15.60";
        assertEquals(expected, actual);

        actual = eval.evaluate("-9×2");
        expected = "-18";
        assertEquals(expected, actual);

        actual = eval.evaluate("0.25×76");
        expected = "19";
        assertEquals(expected, actual);

        actual = eval.evaluate("17.8×0");
        expected = "0";
        assertEquals(expected, actual);

    }

    @Test
    public void evaluateMultiplicationFail1() throws Exception{
        actual = eval.evaluate("5.01×3.8");
        expected = "19.038";
        assertEquals(expected, actual);
    }

    @Test
    public void evaluateMultiplicationFail2() throws Exception{
        actual = eval.evaluate("7.5×2.4");
        expected = "18.00";
        assertEquals(expected, actual);
    }

    @Test
    public void evaluateDivision() throws Exception{
        actual = eval.evaluate("0÷475");
        expected = "0";
        assertEquals(expected, actual);

        actual = eval.evaluate("90÷0.1");
        expected = "900";
        assertEquals(expected, actual);

        actual = eval.evaluate("-15.4÷3.2");
        expected = "-4.81";
        assertEquals(expected, actual);
    }

    @Test
    public void evaluateDivisionFail1() throws Exception{
        actual = eval.evaluate("81.00÷1");
        expected = "81.00";
        assertEquals(expected, actual);
    }

}