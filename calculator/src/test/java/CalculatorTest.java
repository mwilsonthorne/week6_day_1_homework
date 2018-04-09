import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class CalculatorTest {

    private Calculator interger;

    @Before
    public void before(){
        interger = new Calculator (4, 2);
    }

    @Test
    public void hasAdd(){
        assertEquals(6, interger.getAdd());
    }

    @Test
    public void hasSubtract(){
        assertEquals(2, interger.getSubtract());
    }


    @Test
    public void hasMultiple(){
        assertEquals(8, interger.getMultiply());
    }

    @Test
    public void hasDivide(){
        assertEquals(2, interger.getDivide());
    }

}
