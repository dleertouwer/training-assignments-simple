package eu.sig.training.ch03;

import static org.junit.Assert.assertEquals;

import java.awt.Color;
import java.util.List;

import org.junit.Test;

public class FlagsTest {

    @Test
    public void testGetFlag() {
        FlagFactory factory = new FlagFactory();

        List<Color> colorsDutch = factory.getFlagColors(Nationality.DUTCH);

        assertEquals(Color.RED, colorsDutch.get(0));
        assertEquals(Color.WHITE, colorsDutch.get(1));
        assertEquals(Color.BLUE, colorsDutch.get(2));
    
        List<Color> colorsUnclassified = factory.getFlagColors(Nationality.UNCLASSIFIED);
        
        assertEquals(Color.GRAY, colorsUnclassified.get(0));
    }

}