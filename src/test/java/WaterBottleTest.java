import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WaterBottleTest {

    WaterBottle waterBottle;

    @Before
    public void before(){
        waterBottle = new WaterBottle(100);
    }
    @Test
    public void currentVolume(){
        assertEquals(100, waterBottle.currentVolume());
    }
    @Test
    public void drinkWater(){
        waterBottle.drinkWater();
        assertEquals(90, waterBottle.currentVolume());
    }

    @Test
    public void empty(){
        waterBottle.empty();
        assertEquals(0, waterBottle.currentVolume());
    }

    @Test
    public void fillToFullVolume(){
        waterBottle.fillToFullVolume();
        assertEquals(100, waterBottle.currentVolume());
    }
}

