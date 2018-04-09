import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BottleTest {

    private Bottle volume;

    @Before
    public void before(){
        volume = new Bottle (100);
    }

    @Test
    public void hasVolume(){
        assertEquals(100, volume.getVolume());
    }

    @Test
    public void hasDrink(){
        assertEquals(90, volume.getDrink());
    }

    @Test
    public void hasEmpty(){
        assertEquals(0, volume.getEmpty());
    }

    @Test
    public void hasFill(){
        assertEquals(100, volume.getFill());
    }

}
