package boxes;

import java.util.ArrayList;

public class OneThingBox extends Box {
    private ArrayList<Thing>oneThing;
    public OneThingBox() {
        oneThing=new ArrayList<Thing>();
    }

    @Override
    public void add(Thing thing) {
        if(oneThing.isEmpty()==true){
            oneThing.add(thing);
        }

    }

    @Override
    public boolean isInTheBox(Thing thing) {
       if(oneThing.contains(thing)){
           return true;
       }
       return false;
    }
}
