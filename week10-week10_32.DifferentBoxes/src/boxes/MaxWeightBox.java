package boxes;

import java.util.ArrayList;

public class MaxWeightBox extends Box {
    private int maxWeight;
    private ArrayList<Thing>things;

    public MaxWeightBox(int maxWeight) {
        this.maxWeight = maxWeight;
        things=new ArrayList<Thing>();
    }

    @Override
    public void add(Thing thing) {
        int currentWeight=0;
        for(Thing currentThing:things){
            currentWeight+=currentThing.getWeight();
        }
        if (thing.getWeight() +currentWeight<=this.maxWeight) {
            things.add(thing);
        }

    }

    @Override
    public boolean isInTheBox(Thing thing) {
        if(things.contains(thing)){
            return true;
        }
        return false;
    }
}
