import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class StringLengthTest {

    @Test
    public void stringLengthTester() {
        String testCase = "";
        int length = 0;
        boolean result = StringLength.isGreaterThan(testCase, length);
        assertEquals(false, result);
    }

    @Test
    public void summeTester(){
        int var1 = 2;
        int var2 = 4;
        int result = StringLength.summe(var1, var2);
        assertEquals(6, result);
    }

}

