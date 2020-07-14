import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import static org.junit.Assert.assertEquals;
public class UnitTestStringCalculator
{

    StringCalculator stringCalculator = new StringCalculator();

    @Test
    public void testStringCalculatorWithEmptyString()
    {
        assertEquals(stringCalculator.add(""),0);
    }

    @Test
    public void testStringCalculatorWithSingleString()
    {
        assertEquals(stringCalculator.add("1"),1);
    }

    @Test
    public void testStringCalculatorWithAdditionString()
    {
        assertEquals(stringCalculator.add("1,2"),3);
    }

    @Test
    public void testStringCalculatorWithNewLineString()
    {
        assertEquals(stringCalculator.add("1\n2,3"),6);
    }

    @Test
    public void testStringCalculatorWithDelimiterString()
    {
        assertEquals(stringCalculator.add("//;\n1;2"),3);
    }
}
