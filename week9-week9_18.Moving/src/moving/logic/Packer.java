package moving.logic;

import moving.domain.Box;
import moving.domain.Thing;

import java.util.ArrayList;
import java.util.List;

public class Packer  {
    int boxesVolume;
    List<Box>boxes;

    public Packer(int boxesVolume) {
        this.boxesVolume = boxesVolume;
        boxes=new ArrayList<Box>();
    }
    public List<Box> packThings(List<Thing> things){
        List<Box> buffer = new ArrayList<Box>();

        Box box = new Box(this.boxesVolume);

        for (Thing i : things){

            while(box.addThing(i)){

            }



            if(!box.addThing(i)){
                buffer.add(box);
                box = new Box(this.boxesVolume);
            }
        }

        return buffer;
    }


}
