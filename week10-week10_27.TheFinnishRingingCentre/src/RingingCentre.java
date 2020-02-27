import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class RingingCentre {
    private HashMap<Bird, Set<String>> birdObserveLocations;

    public RingingCentre() {
        birdObserveLocations = new HashMap<Bird, Set<String>>();
    }

    public void observe(Bird bird, String place) {
        if (!birdObserveLocations.containsKey(bird)) {
            Set<String> locations = new HashSet<String>();
            birdObserveLocations.put(bird, locations);

        }
        birdObserveLocations.get(bird).add(place);


    }

    public void observations(Bird bird) {
        if (!birdObserveLocations.containsKey(bird)) {
            System.out.println(bird + " observations: 0");
        } else {
            System.out.println(bird+" observations: "+birdObserveLocations.get(bird).size());
            Set<String> locations = new HashSet<String>();
            locations = birdObserveLocations.get(bird);
            for (String location : locations) {
                System.out.println(location);
            }


        }
    }

}
