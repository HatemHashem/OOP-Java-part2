package moving.domain;

public class Item implements Thing, Comparable<Item> {
    private String name;
    private int volume;

    public Item(String name, int volume) {
        this.name = name;
        this.volume = volume;
    }

    @Override
    public int compareTo(Item comparedThing) {
        return this.getVolume() - comparedThing.getVolume();
    }

    @Override
    public int getVolume() {
        return this.volume;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return this.name + " (" + this.volume + " dm^3)";
    }
}
