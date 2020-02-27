package farmsimulator;

import java.util.ArrayList;
import java.util.Collection;

public class Farm implements Alive {
    private String owner;
    private Barn barn;
    private Collection<Cow> cows;

    public Farm(String owner, Barn barn) {
        this.owner = owner;
        this.barn = barn;
        cows = new ArrayList<Cow>();
    }

    @Override
    public void liveHour() {
        for(Cow cow:cows){
            cow.liveHour();
        }

    }

    public String getOwner() {
        return owner;
    }
    public void addCow(Cow cow){
        this.cows.add(cow);
    }
    public void manageCows(){
        this.barn.takeCareOf(cows);
    }
    public void installMilkingRobot(MilkingRobot  robot){
        barn.installMilkingRobot(robot);
    }

    @Override
    public String toString() {
        String farmInfo = "";
        farmInfo += "Farm owner: " + this.owner + "\nBarn bulk tank: " + barn.toString()+"\n";
        if (cows.isEmpty() == true) {
            farmInfo += "No cows.";
        }else {
            farmInfo+="Animals:\n";
            for (Cow cow:cows){
                farmInfo+="\t\t"+cow+"\n";
            }
        }
        return farmInfo;
    }

}
