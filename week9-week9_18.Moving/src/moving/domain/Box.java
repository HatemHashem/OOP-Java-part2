package moving.domain;

import java.util.ArrayList;
import java.util.List;

public class Box implements Thing {
    private int maximumCapacity;
    private List<Thing>items;

    public Box(int maximumCapacity) {
        this.maximumCapacity = maximumCapacity;
        items=new ArrayList<Thing>();
    }
    public boolean addThing(Thing thing){
        if(this.getVolume()+thing.getVolume()<=maximumCapacity){
            this.items.add(thing);
            return true;
        }

        return false;
    }

    @Override
    public int getVolume() {
        int itemsVolume=0;
        for(Thing item:items){
            itemsVolume+=item.getVolume();
        }
        return itemsVolume;
    }
}
