import java.util.ArrayList;

public class Container {
   private int maxThingsInContainer;
    private ArrayList<Suitcase>suitcases;

    public Container(int maxThingsInContainer) {
        this.maxThingsInContainer = maxThingsInContainer;
        suitcases=new ArrayList<Suitcase>();
    }
    public void addSuitcase(Suitcase suitcase){
        int currentContainerWeight=0;
        for(Suitcase suitcase1:suitcases){
            currentContainerWeight+=suitcase1.totalWeight();
        }
        if(suitcase.totalWeight()+currentContainerWeight<=this.maxThingsInContainer){
            suitcases.add(suitcase);

        }
    }
    public String toString(){
        int currentWeight = 0;
        String properThing = "";
        for (Suitcase thingInSuitCase : suitcases) {
            currentWeight += thingInSuitCase.totalWeight();
        }
        if (suitcases.size() > 1) {
            properThing = "suitcases";
        } else if (suitcases.size() == 1) {
            properThing = "suitcase";
        } else {
            properThing = "empty (0 kg)";
            return properThing;
        }
        return suitcases.size() + " " + properThing + " (" + currentWeight + " kg)";

    }
    public void printThings(){
        for(Suitcase suitcase:suitcases){
            suitcase.printThings();
        }
    }
}
