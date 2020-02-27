package movable;

import java.util.ArrayList;
import java.util.List;

public class Group implements Movable {
    private List<Movable>organisms;

    public Group() {
        organisms=new ArrayList<Movable>();
    }

    @Override
    public void move(int dx, int dy) {
        for(Movable currentMovable:organisms){
            currentMovable.move(dx,dy);
        }

    }
    public void addToGroup(Movable movable){
        organisms.add(movable);
    }
    @Override
    public String toString(){
        String allOrgs="";

       for(int i=0;i<organisms.size();i++){
           allOrgs+=organisms.get(i)+"\n";
       }
        return allOrgs;

    }

}
