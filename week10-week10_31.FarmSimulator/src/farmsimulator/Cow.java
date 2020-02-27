package farmsimulator;

import java.util.Random;

public class Cow implements Milkable,Alive {
    private static final String[] NAMES = new String[]{
            "Anu", "Arpa", "Essi", "Heluna", "Hely",
            "Hento", "Hilke", "Hilsu", "Hymy", "Ihq", "Ilme", "Ilo",
            "Jaana", "Jami", "Jatta", "Laku", "Liekki",
            "Mainikki", "Mella", "Mimmi", "Naatti",
            "Nina", "Nyytti", "Papu", "Pullukka", "Pulu",
            "Rima", "Soma", "Sylkki", "Valpu", "Virpi"};
    private String name;
    private double capacity;
    private double amount;


    public Cow() {
        this.capacity = 15 + new Random().nextInt(26); // between 15 and 40;
        this.name = NAMES[new Random().nextInt(NAMES.length)];

    }

    public Cow(String name) {
        this.name = name;
        this.capacity = 15 + new Random().nextInt(26);
    }

    public String getName() {
        return name;
    }

    public double getCapacity() {
        return capacity;
    }

    public double getAmount() {
        return amount;
    }

    @Override
    public void liveHour() {
        if(this.amount+(0.7+ (2-.7)*new Random().nextDouble())<this.capacity) {
            this.amount += 0.7 + (2 - .7) * new Random().nextDouble();
        }else {
            this.amount=this.capacity;
        }

    }

    @Override
    public double milk() {
        double temp=this.amount;
        this.amount=0;
        return temp;
    }

    @Override
    public String toString() {
        return this.name+" "+Math.ceil(amount)+"/"+Math.ceil(this.capacity);
    }
}
