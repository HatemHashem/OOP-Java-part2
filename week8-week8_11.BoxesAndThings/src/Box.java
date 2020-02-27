import java.util.ArrayList;

public class Box implements ToBeStored {
    private double maxWeight;
    private ArrayList<ToBeStored>items;

    public Box(double maxWeight) {
        this.maxWeight = maxWeight;
        items=new ArrayList<ToBeStored>();
    }
    public void add(ToBeStored item){
        double currentWeight=weight();
        if(currentWeight+item.weight()<=maxWeight)
            items.add(item);

    }
    public double weight(){
        double weight=0;
        for(ToBeStored item:items){
            weight+=item.weight();
        }
        return weight;
    }

    @Override
    public String toString() {
        return "Box: "+items.size()+" things, total weight "+this.weight()+" kg";
    }
}
