package boxes;

import java.util.ArrayList;

public class BlackHoleBox extends Box {
    private ArrayList<Thing>blackHoleThings;
    public BlackHoleBox() {
        blackHoleThings=new ArrayList<Thing>();
    }

    @Override
    public void add(Thing thing) {
        blackHoleThings.add(thing);
    }

    @Override
    public boolean isInTheBox(Thing thing) {
        return false;
    }
}
