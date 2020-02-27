public class CD implements ToBeStored {
    private String artist;
    private String title;
    private int year;
    private  final double WEIGHT=.1;

    public CD(String artist, String title, int year) {
        this.artist = artist;
        this.title = title;
        this.year = year;
    }

    @Override
    public double weight() {
        return this.WEIGHT;
    }
    public String toString(){
        return this.artist+": "+this.title+" ("+this.year+")";
    }
}
