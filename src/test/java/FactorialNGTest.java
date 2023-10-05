import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class FactorialNGTest {

    @Test
    public void testCalculateFactorial() {
    }

    @Test
    public void testAssertEquals() {
        Assert.assertEquals(5, 120);
        System.out.println("Equals Assertion is successful");
    }
}