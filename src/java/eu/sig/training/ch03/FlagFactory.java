package eu.sig.training.ch03;

import java.awt.Color;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static eu.sig.training.ch03.Nationality.*;

public class FlagFactory {
    
    private static final Map<Nationality, Flag> FLAGS = new HashMap<>();
    
    static {
        FLAGS.put(DUTCH, new DutchFlag());
        FLAGS.put(GERMAN, new GermanFlag());
        FLAGS.put(BELGIAN, new BelgianFlag());
        FLAGS.put(FRENCH, new FrenchFlag());
        FLAGS.put(ITALIAN, new ItalianFlag());
        FLAGS.put(ROMANIA, new RomanianFlag());
        FLAGS.put(IRELAND, new IrishFlag());
        FLAGS.put(HUNGARIAN, new HungarianFlag());
        FLAGS.put(BULGARIAN, new BulgarianFlag());
        FLAGS.put(RUSSIA, new RussianFlag());
    }
    
    public List<Color> getFlagColors(Nationality nationality) {
        Flag flag = FLAGS.get(nationality);
        return flag != null ? flag.getColors() : new UnclassifiedFlag().getColors();
    }

}