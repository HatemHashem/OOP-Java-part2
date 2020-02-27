import java.util.ArrayList;

public class Suitcase {
    private ArrayList<Thing> things;
    private int maxWeightLimit;

    public Suitcase(int maxWeightLimit) {
        this.maxWeightLimit = maxWeightLimit;
        things = new ArrayList<Thing>();
    }

    public void addThing(Thing thing) {
        int currentWeight = 0;
        for (Thing thingInSuitCase : things) {
            currentWeight += thingInSuitCase.getWeight();
        }
        if (thing.getWeight() + currentWeight <= this.maxWeightLimit) {
            things.add(thing);
        }

    }

    public String toString() {
        int currentWeight = 0;
        String properThing = "";
        for (Thing thingInSuitCase : things) {
            currentWeight += thingInSuitCase.getWeight();
        }
        if (things.size() > 1) {
            properThing = "things";
        } else if (things.size() == 1) {
            properThing = "thing";
        } else {
            properThing = "empty (0 kg)";
            return properThing;
        }
        return things.size() + " " + properThing + " (" + currentWeight + " kg)";
    }

    public void printThings() {
        for (Thing thing : things) {
            System.out.println(thing);
        }
    }

    public int totalWeight() {
        int currentWeight = 0;
        for (Thing thingInSuitCase : things) {
            currentWeight += thingInSuitCase.getWeight();
        }
        return currentWeight;
    }
    public Thing heaviestThing(){
        if(things.isEmpty()){
            return null;
        }
        int heaviestItem=this.things.get(0).getWeight();
        Thing heaviestThing=things.get(0);
        for(Thing thing:things){
            if(thing.getWeight()>heaviestItem){
                heaviestItem=thing.getWeight();
                heaviestThing=thing;
            }
        }


        return heaviestThing;

    }
}
